package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;
import play.Logger;
import util.MorphiaUtil;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 7/28/2014.
 */
@Entity
public class SnipCollection {

    @Transient
    public static final int MAX_SIZE = 10;

    @Id
    public ObjectId id;

    public List<ObjectId> storedSnips;

    @Transient
    public List<Snip> savedSnips;

    @Reference
    public User user;


    public static SnipCollection findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<SnipCollection> q = MorphiaUtil.getDatastore().find(SnipCollection.class).field("id").equal(oid);
        SnipCollection snipCollection = q.get();
        if(snipCollection != null) {
            snipCollection.savedSnips = snipCollection.getSnips();
            if(snipCollection.savedSnips == null) {
                snipCollection.savedSnips = new ArrayList<Snip>();
            }
            if(snipCollection.storedSnips == null) {
                snipCollection.storedSnips = new ArrayList<ObjectId>();
            }
        }
        return snipCollection;
    }


    public static SnipCollection findByUser(final User user){
        Query<SnipCollection> q = MorphiaUtil.getDatastore().find(SnipCollection.class).field("user").equal(user);
        SnipCollection snipCollection = q.get();
        if(snipCollection != null) {
            snipCollection.savedSnips = snipCollection.getSnips();
            if(snipCollection.savedSnips == null) {
                snipCollection.savedSnips = new ArrayList<Snip>();
            }
            if(snipCollection.storedSnips == null) {
                snipCollection.storedSnips = new ArrayList<ObjectId>();
            }
        }
        return snipCollection;
    }

    public static SnipCollection findByUserOmit(final User user, String... fields){
        Query<SnipCollection> q = MorphiaUtil.getDatastore().find(SnipCollection.class).field("user").equal(user).retrievedFields(true, fields);
        SnipCollection snipCollection = q.get();
        if(snipCollection != null) {
            snipCollection.savedSnips = snipCollection.getSnips();
            if(snipCollection.savedSnips == null) {
                snipCollection.savedSnips = new ArrayList<Snip>();
            }
            if(snipCollection.storedSnips == null) {
                snipCollection.storedSnips = new ArrayList<ObjectId>();
            }
        }
        return snipCollection;
    }

    public static boolean addSnip(final SnipCollection snipCollection, final Snip snip) {
        boolean duplicate = false;
        if(snipCollection.storedSnips.size() < MAX_SIZE) {
            for(ObjectId oid: snipCollection.storedSnips) {
                if(oid.equals(snip.id)) {
                    duplicate = true;
                }
            }
            if(!duplicate) {
                snip.favourite();
                snipCollection.storedSnips.add(snip.id);
                snipCollection.update();
            }
            return true;
        }
        return false;
    }

    public static boolean toggleSnip(final SnipCollection snipCollection, final Snip snip) {
        if(!snipCollection.user.id.equals(snip.user.id)) {
            if (!removeSnip(snipCollection, snip)) {
                addSnip(snipCollection, snip);
                return true;
            }
        }
        return false;
    }



    public static boolean removeSnip(final SnipCollection snipCollection, final Snip snip) {
        for (ObjectId oid: snipCollection.storedSnips) {
            if (oid.equals(snip.id)) {
                snip.unfavourite();
                snipCollection.storedSnips.remove(oid);
                snipCollection.update();
                return true;
            }
        }
        return false;
    }

    public static void create(final User user) {
        SnipCollection snipCollection = new SnipCollection();
        snipCollection.storedSnips = new ArrayList<ObjectId>();
        snipCollection.user = user;

        snipCollection.update();
    }

    public static boolean isFavourited(final SnipCollection snipCollection, final Snip snip) {
        for(ObjectId oid: snipCollection.storedSnips) {
            if(oid.equals(snip.id)) {
                return true;
            }
        }
        return false;
    }

    public List<Snip> getSnips() {
        List<Snip> snips = new ArrayList<Snip>();
        List<ObjectId> oids = new ArrayList<ObjectId>();
        if(storedSnips != null) {
            oids.addAll(storedSnips);
        }

        for (ObjectId id : oids) {
            Snip fetchedSnip = Snip.findById(id);
            if (validate(fetchedSnip)) {
                snips.add(fetchedSnip);
            } else {
                storedSnips.remove(id);
            }
        }

        if (storedSnips != null && !(snips.size() == storedSnips.size())) {
            update();
        }

        return snips;
    }

    public static boolean validate(final Snip snip) {
        boolean isValid = false;
        if(snip != null) {
            isValid = true;
        }
        return isValid;
    }

    private void update() {
        MorphiaUtil.getDatastore().save(this);
    }
}
