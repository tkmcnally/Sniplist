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
public class MySniplists {

    @Transient
    public static final int MAX_SIZE = 100;

    @Id
    public ObjectId id;

    @Reference
    public List<SnipList> savedSniplists;

    @Reference
    public User user;


    public static MySniplists findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<MySniplists> q = MorphiaUtil.getDatastore().find(MySniplists.class).field("id").equal(oid);
        return q.get();
    }


    public static MySniplists findByUser(final User user){
        Query<MySniplists> q = MorphiaUtil.getDatastore().find(MySniplists.class).field("user").equal(user);
        return q.get();
    }

    public static boolean addSniplist(final MySniplists mySniplists, final SnipList snipList) {
        boolean duplicate = false;
        if(mySniplists.savedSniplists.size() < MAX_SIZE) {
            for(SnipList s: mySniplists.savedSniplists) {
                if(s.id.equals(snipList.id)) {
                    duplicate = true;
                }
            }
            if(!duplicate) {
                snipList.favourite();
                mySniplists.savedSniplists.add(snipList);
                MorphiaUtil.getDatastore().save(mySniplists);
            }
            return true;
        }
        return false;
    }

    public static boolean toggleSniplist(final MySniplists mySniplists, final SnipList snipList) {
        if(!removeSniplist(mySniplists, snipList)) {
            addSniplist(mySniplists, snipList);
            return true;
        } else {
            return false;
        }
    }

    public static boolean removeSniplist(final MySniplists mySniplists, final SnipList snipList) {
        for (SnipList s : mySniplists.savedSniplists) {
            if (s.id.equals(snipList.id)) {
                snipList.unfavourite();
                mySniplists.savedSniplists.remove(s);
                MorphiaUtil.getDatastore().save(mySniplists);
                return true;
            }
        }
        return false;
    }

    public static void create(final User user) {
        MySniplists mySniplists = new MySniplists();
        mySniplists.savedSniplists = new ArrayList<SnipList>();
        mySniplists.user = user;

        MorphiaUtil.getDatastore().save(mySniplists);
    }


    public static boolean isFavourited(final MySniplists mySniplists, final SnipList snipList) {
        for(SnipList s: mySniplists.savedSniplists) {
            if(s.id.equals(snipList.id)) {
                return true;
            }
        }
        return false;
    }

    public static MySniplists copy(final MySniplists mySnipLists) {
        MySniplists newSniplists = new MySniplists();
        newSniplists.savedSniplists = new ArrayList<SnipList>();
        newSniplists.savedSniplists.addAll(mySnipLists.savedSniplists);
        newSniplists.user = mySnipLists.user;
        return newSniplists;
    }

}
