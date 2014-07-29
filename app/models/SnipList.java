package models;

import controllers.SnipLists;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.query.Query;
import play.data.format.Formats;
import util.MorphiaUtil;

import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thomas on 7/25/2014.
 */

@Entity("sniplists")
public class SnipList {
    @Transient
    public static final int MAX_SIZE = 6;

    @Id
    public ObjectId id;

    @Reference
    public User user;

    public String name;

    @Reference
    public List<Snip> snips;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date creation_date;

    public int favourite_count;

    public static SnipList create(final SnipLists.MySnipList snipListForm, final User user) {

        SnipList snipList = new SnipList();

        snipList.name = snipListForm.sniplist_name;
        snipList.user = user;
        snipList.snips = new ArrayList<Snip>();

        snipList.favourite_count = 0;
        snipList.creation_date = new Date();

        MorphiaUtil.getDatastore().save(snipList);

        return snipList;
    }

    public static void deleteById(final String id) {
        MorphiaUtil.getDatastore().delete(findById(id));
    }

    public static Query<SnipList> findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<SnipList> q = MorphiaUtil.getDatastore().find(SnipList.class).field("id").equal(oid);
        return q;
    }


    public static boolean isOwner(final User user, final SnipList snipList) {

        boolean owned = false;
        if(user != null && snipList != null) {
            System.out.println(user.id + " EQUAL; " + snipList.user.id);
            if(user.id.equals(snipList.user.id)) {
                owned = true;
            }
        }
        return owned;
    }

    public static List<SnipList> findByUser(final User user){
        Query<SnipList> q = MorphiaUtil.getDatastore().find(SnipList.class).field("user").equal(user);
        return q.asList();
    }

    public static void addSnipToSnipList(final SnipList snipList, final Snip snip) {
        snipList.snips.add(snip);
        MorphiaUtil.getDatastore().save(snipList);
    }

    public static void deleteSnipList(final SnipList snipList) {
        MorphiaUtil.getDatastore().delete(snipList);
    }

    public static void deleteSnipFromSnipList(final SnipList snipList, final Snip snip) {
        for(Snip s: snipList.snips) {
            if(s.id.equals(snip.id)) {
                snipList.snips.remove(s);
                break;
            }
        }
        MorphiaUtil.getDatastore().save(snipList);
    }

    public boolean isFull() {
        if(snips.size() >= MAX_SIZE) {
            return true;
        }
        return false;
    }

}
