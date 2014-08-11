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
public class Sniplist {
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


    public static Sniplist create(final SniplistController.MySnipList snipListForm, final User user) {

        Sniplist sniplist = new Sniplist();

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

    public static Query<Sniplist> findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<Sniplist> q = MorphiaUtil.getDatastore().find(Sniplist.class).field("id").equal(oid);
        return q;
    }


    public static boolean isOwner(final User user, final Sniplist sniplist) {

        boolean owned = false;
        if(user != null && sniplist != null) {
            if(user.id.equals(sniplist.user.id)) {
                owned = true;
            }
        }
        return owned;
    }

    public static List<Sniplist> findByUser(final User user){
        Query<Sniplist> q = MorphiaUtil.getDatastore().find(Sniplist.class).field("user").equal(user);
        return q.asList();
    }

    public static void addSnipToSnipList(final Sniplist sniplist, final Snip snip) {
        sniplist.snips.add(snip);
        MorphiaUtil.getDatastore().save(sniplist);
    }

    public static void deleteSnipList(final Sniplist sniplist) {
        MorphiaUtil.getDatastore().delete(sniplist);
    }

    public static void deleteSnipFromSnipList(final Sniplist sniplist, final Snip snip) {
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

    public static List<Sniplist> findPopular() {
        return MorphiaUtil.getDatastore().createQuery(Sniplist.class).order("-favouriteCount").asList();
    }

}
