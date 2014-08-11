package models;

import controllers.SniplistController;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;
import play.data.format.Formats;
import util.MorphiaUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thomas on 7/25/2014.
 */

@Entity("sniplists")
public class Sniplist1 {
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

    public int favouriteCount;

    @Transient
    public boolean localUserFavourited;


    public static Sniplist1 create(final SniplistController.MySnipList snipListForm, final User user) {

        Sniplist1 sniplist = new Sniplist1();

        sniplist.name = snipListForm.sniplist_name;
        sniplist.user = user;
        sniplist.snips = new ArrayList<Snip>();

        sniplist.favouriteCount = 0;
        sniplist.creation_date = new Date();

        MorphiaUtil.getDatastore().save(sniplist);

        return sniplist;
    }

    public static void deleteById(final String id) {
        MorphiaUtil.getDatastore().delete(findById(id));
    }

    public static Query<Sniplist1> findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<Sniplist1> q = MorphiaUtil.getDatastore().find(Sniplist1.class).field("id").equal(oid);
        return q;
    }


    public static boolean isOwner(final User user, final Sniplist1 sniplist) {

        boolean owned = false;
        if(user != null && sniplist != null) {
            if(user.id.equals(sniplist.user.id)) {
                owned = true;
            }
        }
        return owned;
    }

    public static List<Sniplist1> findByUser(final User user){
        Query<Sniplist1> q = MorphiaUtil.getDatastore().find(Sniplist1.class).field("user").equal(user);
        return q.asList();
    }

    public static void addSnipToSnipList(final Sniplist1 sniplist, final Snip snip) {
        sniplist.snips.add(snip);
        MorphiaUtil.getDatastore().save(sniplist);
    }

    public static void deleteSnipList(final Sniplist1 sniplist) {
        MorphiaUtil.getDatastore().delete(sniplist);
    }

    public static void deleteSnipFromSnipList(final Sniplist1 sniplist, final Snip snip) {
        for(Snip s: sniplist.snips) {
            if(s.id.equals(snip.id)) {
                sniplist.snips.remove(s);
                break;
            }
        }
        MorphiaUtil.getDatastore().save(sniplist);
    }

    public boolean isFull() {
        if(snips.size() >= MAX_SIZE) {
            return true;
        }
        return false;
    }

    public void favourite() {
        favouriteCount++;
        MorphiaUtil.getDatastore().save(this);
    }

    public void unfavourite() {
        favouriteCount--;
        if(favouriteCount < 0) {
            favouriteCount = 0;
        }
        MorphiaUtil.getDatastore().save(this);
    }

    public static List<Sniplist1> findPopular() {
        return MorphiaUtil.getDatastore().createQuery(Sniplist1.class).order("-favouriteCount").asList();
    }

}
