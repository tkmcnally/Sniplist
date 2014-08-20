package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;
import util.MorphiaUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 7/29/2014.
 */
public class SniplistCollection {

    @Transient
    public static final int MAX_SIZE = 100;

    @Id
    public ObjectId id;

    public List<ObjectId> storedSniplists;

    @Transient
    public List<Sniplist> savedSniplists;

    @Reference
    public User user;


    public static SniplistCollection findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<SniplistCollection> q = MorphiaUtil.getDatastore().find(SniplistCollection.class).field("id").equal(oid);
        SniplistCollection sniplistCollection = q.get();
        if(sniplistCollection != null) {
            sniplistCollection.savedSniplists = sniplistCollection.getSniplists();
            if(sniplistCollection.savedSniplists == null) {
                sniplistCollection.savedSniplists = new ArrayList<Sniplist>();
            }
            if(sniplistCollection.storedSniplists == null) {
                sniplistCollection.storedSniplists = new ArrayList<ObjectId>();
            }
        }
        return sniplistCollection;
    }


    public static SniplistCollection findByUser(final User user){
        Query<SniplistCollection> q = MorphiaUtil.getDatastore().find(SniplistCollection.class).field("user").equal(user);
        SniplistCollection sniplistCollection = q.get();
        if(sniplistCollection != null) {
            sniplistCollection.savedSniplists = sniplistCollection.getSniplists();
            if(sniplistCollection.savedSniplists == null) {
                sniplistCollection.savedSniplists = new ArrayList<Sniplist>();
            }
            if(sniplistCollection.storedSniplists == null) {
                sniplistCollection.storedSniplists = new ArrayList<ObjectId>();
            }
        }
        return sniplistCollection;
    }

    public static SniplistCollection findByUserOmit(final User user, String... fields){
        Query<SniplistCollection> q = MorphiaUtil.getDatastore().find(SniplistCollection.class).field("user").equal(user).retrievedFields(true, fields);
        SniplistCollection sniplistCollection = q.get();
        if(sniplistCollection != null) {
            sniplistCollection.savedSniplists = sniplistCollection.getSniplists();
            if(sniplistCollection.savedSniplists == null) {
                sniplistCollection.savedSniplists = new ArrayList<Sniplist>();
            }
            if(sniplistCollection.storedSniplists == null) {
                sniplistCollection.storedSniplists = new ArrayList<ObjectId>();
            }
        }
        return sniplistCollection;
    }

    public static boolean addSniplist(final SniplistCollection sniplistCollection, final Sniplist sniplist) {
        boolean duplicate = false;
        if(sniplistCollection.storedSniplists.size() < MAX_SIZE) {
            for(ObjectId oid: sniplistCollection.storedSniplists) {
                if(oid.equals(sniplist.id)) {
                    duplicate = true;
                }
            }
            if(!duplicate) {
                sniplist.favourite();
                sniplistCollection.storedSniplists.add(sniplist.id);
                sniplistCollection.update();
            }
            return true;
        }
        return false;
    }

    public static boolean toggleSniplist(final SniplistCollection sniplistCollection, final Sniplist sniplist) {
        if(!sniplistCollection.user.id.equals(sniplist.user.id)) {
            if (!removeSniplist(sniplistCollection, sniplist)) {
                addSniplist(sniplistCollection, sniplist);
                return true;
            }
        }
        return false;
    }

    public static boolean removeSniplist(final SniplistCollection sniplistCollection, final Sniplist sniplist) {
        for (ObjectId oid : sniplistCollection.storedSniplists) {
            if (oid.equals(sniplist.id)) {
                sniplist.unfavourite();
                sniplistCollection.storedSniplists.remove(oid);
                sniplistCollection.update();
                return true;
            }
        }
        return false;
    }

    public static void create(final User user) {
        SniplistCollection sniplistCollection = new SniplistCollection();
        sniplistCollection.storedSniplists = new ArrayList<ObjectId>();
        sniplistCollection.user = user;

        sniplistCollection.update();
    }


    public static boolean isFavourited(final SniplistCollection sniplistCollection, final Sniplist sniplist) {
        for(ObjectId oid: sniplistCollection.storedSniplists) {
            if(oid.equals(sniplist.id)) {
                return true;
            }
        }
        return false;
    }

    public static SniplistCollection copy(final SniplistCollection mySnipLists) {
        SniplistCollection newSniplists = new SniplistCollection();
        newSniplists.storedSniplists = new ArrayList<ObjectId>();
        newSniplists.storedSniplists.addAll(mySnipLists.storedSniplists);
        newSniplists.savedSniplists = mySnipLists.savedSniplists;
        newSniplists.user = mySnipLists.user;
        return newSniplists;
    }

    public List<Sniplist> getSniplists() {
        List<Sniplist> sniplists = new ArrayList<Sniplist>();
        List<ObjectId> oids = new ArrayList<ObjectId>();
        if(storedSniplists != null) {
            oids.addAll(storedSniplists);
        }

        for (ObjectId id : oids) {
            Sniplist fetchedSnip = Sniplist.findById(id);
            if (validate(fetchedSnip)) {
                sniplists.add(fetchedSnip);
            } else {
                storedSniplists.remove(id);
            }
        }

        if (storedSniplists != null && !(sniplists.size() == storedSniplists.size())) {
            update();
        }

        return sniplists;
    }

    public static boolean validate(final Sniplist sniplist) {
        boolean isValid = false;
        if(sniplist != null) {
            isValid = true;
        }
        return isValid;
    }

    private void update() {
        MorphiaUtil.getDatastore().save(this);
    }
}
