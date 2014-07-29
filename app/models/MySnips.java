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
@Entity("mySnips")
public class MySnips {

    @Transient
    public static final int MAX_SIZE = 10;

    @Id
    public ObjectId id;

    @Reference
    public List<Snip> savedSnips;

    @Reference
    public User user;


    public static MySnips findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<MySnips> q = MorphiaUtil.getDatastore().find(MySnips.class).field("id").equal(oid);
        return q.get();
    }


    public static MySnips findByUser(final User user){
        Query<MySnips> q = MorphiaUtil.getDatastore().find(MySnips.class).field("user").equal(user);
        return q.get();
    }

    public static boolean addSnip(final MySnips mySnips, final Snip snip) {
        boolean duplicate = false;
        if(mySnips.savedSnips.size() < MAX_SIZE) {
            for(Snip s: mySnips.savedSnips) {
                if(s.id.equals(snip.id)) {
                    duplicate = true;
                }
            }
            if(!duplicate) {
                mySnips.savedSnips.add(snip);
                MorphiaUtil.getDatastore().save(mySnips);
            }
            return true;
        }
        return false;
    }

    public static boolean toggleSnip(final MySnips mySnips, final Snip snip) {
        if(!removeSnip(mySnips, snip)) {
            addSnip(mySnips, snip);
            System.out.println("added");
            return true;
        } else {
            System.out.println("removed");
            return false;
        }
    }



    public static boolean removeSnip(final MySnips mySnips, final Snip snip) {
        for (Snip s : mySnips.savedSnips) {
            if (s.id.equals(snip.id)) {
                mySnips.savedSnips.remove(s);
                MorphiaUtil.getDatastore().save(mySnips);
                return true;
            }
        }
        return false;
    }

    public static void create(final User user) {
        MySnips mySnips = new MySnips();
        mySnips.savedSnips = new ArrayList<Snip>();
        mySnips.user = user;

        MorphiaUtil.getDatastore().save(mySnips);
    }

    public static boolean isFavourited(final MySnips mySnips, final Snip snip) {
        for(Snip s: mySnips.savedSnips) {
            if(s.id.equals(snip.id)) {
                return true;
            }
        }
        return false;
    }

}
