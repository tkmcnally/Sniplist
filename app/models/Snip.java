package models;

import controllers.Snips;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.query.Query;
import play.data.format.Formats;
import util.MorphiaUtil;

import java.util.Date;
import java.util.List;

/**
 * Created by Thomas on 6/16/2014.
 */
@Entity("snips")
public class Snip {

    @Id
    public ObjectId id;

    public String url;

    @Reference
    public User user;

    public Double begin_time;

    public Double end_time;

    public String song_name;

    public String artist_name;

    public String album_name;

    public String song_genre;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date creation_date;

    public String direct_url;


    public void deleteBySnip(final Snip snip) {
        MorphiaUtil.getDatastore().delete(snip);
    }

    public static Snip create(final Snips.MySnip snipForm,  final User user) {
        Snip new_snip = new Snip();
        new_snip.creation_date = new Date();
        new_snip.song_name = snipForm.snip_title;
        new_snip.url = snipForm.snip_video_id;
        new_snip.user = user;
        new_snip.artist_name = snipForm.snip_artist;

        MorphiaUtil.getDatastore().save(new_snip);
        return new_snip;
    }


    public static List<Snip> findByUser(final User user){
        Query<Snip> q = MorphiaUtil.getDatastore().find(Snip.class).field("user").equal(user);
        return q.asList();
    }



}
