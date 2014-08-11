package models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;
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

    @Reference
    public List<Snip> savedSnips;

    @Reference
    public User user;


    public static SnipCollection findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<SnipCollection> q = MorphiaUtil.getDatastore().find(SnipCollection.class).field("id").equal(oid);
        return q.get();
    }


    public static SnipCollection findByUser(final User user){
        Query<SnipCollection> q = MorphiaUtil.getDatastore().find(SnipCollection.class).field("user").equal(user);
        return q.get();
    }

    public static boolean addSnip(final SnipCollection snipCollection, final Snip snip) {
        boolean duplicate = false;
        if(snipCollection.savedSnips.size() < MAX_SIZE) {
            for(Snip s: snipCollection.savedSnips) {
                if(s.id.equals(snip.id)) {
                    duplicate = true;
                }
            }
            if(!duplicate) {
                snip.favourite();
                snipCollection.savedSnips.add(snip);
                MorphiaUtil.getDatastore().save(snipCollection);
            }
            return true;
        }
        return false;
    }

    public static boolean toggleSnip(final SnipCollection snipCollection, final Snip snip) {
        if(!removeSnip(snipCollection, snip)) {
            addSnip(snipCollection, snip);
            return true;
        } else {
            return false;
        }
    }



    public static boolean removeSnip(final SnipCollection snipCollection, final Snip snip) {
        for (Snip s : snipCollection.savedSnips) {
            if (s.id.equals(snip.id)) {
                snip.unfavourite();
                snipCollection.savedSnips.remove(s);
                MorphiaUtil.getDatastore().save(snipCollection);
                return true;
            }
        }
        return false;
    }

    public static void create(final User user) {
        SnipCollection snipCollection = new SnipCollection();
        snipCollection.savedSnips = new ArrayList<Snip>();
        snipCollection.user = user;

        MorphiaUtil.getDatastore().save(snipCollection);
    }

    public static boolean isFavourited(final SnipCollection snipCollection, final Snip snip) {
        for(Snip s: snipCollection.savedSnips) {
            if(s.id.equals(snip.id)) {
                return true;
            }
        }
        return false;
    }

}
