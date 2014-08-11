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

    @Reference
    public List<Sniplist1> savedSniplists;

    @Reference
    public User user;


    public static SniplistCollection findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<SniplistCollection> q = MorphiaUtil.getDatastore().find(SniplistCollection.class).field("id").equal(oid);
        return q.get();
    }


    public static SniplistCollection findByUser(final User user){
        Query<SniplistCollection> q = MorphiaUtil.getDatastore().find(SniplistCollection.class).field("user").equal(user);
        return q.get();
    }

    public static boolean addSniplist(final SniplistCollection sniplistCollection, final Sniplist1 sniplist) {
        boolean duplicate = false;
        if(sniplistCollection.savedSniplists.size() < MAX_SIZE) {
            for(Sniplist1 s: sniplistCollection.savedSniplists) {
                if(s.id.equals(sniplist.id)) {
                    duplicate = true;
                }
            }
            if(!duplicate) {
                sniplist.favourite();
                sniplistCollection.savedSniplists.add(sniplist);
                MorphiaUtil.getDatastore().save(sniplistCollection);
            }
            return true;
        }
        return false;
    }

    public static boolean toggleSniplist(final SniplistCollection sniplistCollection, final Sniplist1 sniplist) {
        if(!removeSniplist(sniplistCollection, sniplist)) {
            addSniplist(sniplistCollection, sniplist);
            return true;
        } else {
            return false;
        }
    }

    public static boolean removeSniplist(final SniplistCollection sniplistCollection, final Sniplist1 sniplist) {
        for (Sniplist1 s : sniplistCollection.savedSniplists) {
            if (s.id.equals(sniplist.id)) {
                sniplist.unfavourite();
                sniplistCollection.savedSniplists.remove(s);
                MorphiaUtil.getDatastore().save(sniplistCollection);
                return true;
            }
        }
        return false;
    }

    public static void create(final User user) {
        SniplistCollection sniplistCollection = new SniplistCollection();
        sniplistCollection.savedSniplists = new ArrayList<Sniplist1>();
        sniplistCollection.user = user;

        MorphiaUtil.getDatastore().save(sniplistCollection);
    }


    public static boolean isFavourited(final SniplistCollection sniplistCollection, final Sniplist1 sniplist) {
        for(Sniplist1 s: sniplistCollection.savedSniplists) {
            if(s.id.equals(sniplist.id)) {
                return true;
            }
        }
        return false;
    }

    public static SniplistCollection copy(final SniplistCollection mySnipLists) {
        SniplistCollection newSniplists = new SniplistCollection();
        newSniplists.savedSniplists = new ArrayList<Sniplist1>();
        newSniplists.savedSniplists.addAll(mySnipLists.savedSniplists);
        newSniplists.user = mySnipLists.user;
        return newSniplists;
    }

}
