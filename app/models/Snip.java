package models;

import controllers.Snips;
import de.umass.lastfm.Album;
import de.umass.lastfm.Track;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;
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

    public String mb_id;

    @Reference
    public User user;

    public String time_max;

    public String time_min;

    public String song_name;

    public String artist_name;

    public String album_name;

    public String song_genre;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date creation_date;

    public String direct_url;

    @Transient
    public Track track;

    @Transient
    public Album album;


    public static void deleteById(final String id) {
        MorphiaUtil.getDatastore().delete(findById(id));
    }

    public static Query<Snip> findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<Snip> q = MorphiaUtil.getDatastore().find(Snip.class).field("id").equal(oid);
        return q;
    }

    public static Snip create(final Snips.MySnip snipForm,  final User user) {
        Snip new_snip = new Snip();
        new_snip.creation_date = new Date();
        new_snip.song_name = snipForm.snip_title;
        new_snip.url = snipForm.snip_video_id;
        new_snip.user = user;
        new_snip.artist_name = snipForm.snip_artist;
        new_snip.album_name = snipForm.snip_album;
        new_snip.time_min = snipForm.time_min;
        new_snip.time_max = snipForm.time_max;

        MorphiaUtil.getDatastore().save(new_snip);
        return new_snip;
    }


    public static List<Snip> findByUser(final User user){
        Query<Snip> q = MorphiaUtil.getDatastore().find(Snip.class).field("user").equal(user);
        return q.asList();
    }

    public static Snip mapperLastFM(final Track track) {
        Snip snip = new Snip();
        if(track != null) {
            snip.song_name = track.getName();
            snip.mb_id = track.getId();
            snip.artist_name = track.getArtist();
            snip.track = track;
            snip.album_name = track.getAlbum();
        }

        return snip;
    }

    public static boolean isOwner(final User user, final Snip snip) {
        //Query<Snip> q = MorphiaUtil.getDatastore().find(Snip.class).field("id").equal(snip.id).field("user").equal(user);

        boolean owned = false;
        if(user != null && snip != null) {
            System.out.println(user.id + " EQUAL; " + snip.user.id);
            if(user.id.equals(snip.user.id)) {
                owned = true;
            }
        }
        return owned;
    }

}
