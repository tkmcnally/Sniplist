package models;

import controllers.SnipController;
import de.umass.lastfm.Album;
import de.umass.lastfm.ImageSize;
import de.umass.lastfm.Track;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.annotations.Transient;
import org.mongodb.morphia.query.Query;
import play.data.format.Formats;
import service.api.impl.LastFMAPI;
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

    public int favouriteCount;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date creation_date;

    public String direct_url;

    public String thumbnail_url;

    @Transient
    public Track track;

    @Transient
    public Album album;

    @Transient
    public boolean localUserFavourited;


    public static void deleteById(final String id) {
        MorphiaUtil.getDatastore().delete(findById(id));
    }

    public static Query<Snip> findById(final String id) {
        ObjectId oid = new ObjectId(id);
        Query<Snip> q = MorphiaUtil.getDatastore().find(Snip.class).field("id").equal(oid);
        return q;
    }

    public static Snip create(final SnipController.MySnip snipForm,  final User user) {

        Snip newSnip = LastFMAPI.executeSearch(snipForm.snip_title, snipForm.snip_artist);

        Snip new_snip = new Snip();
        new_snip.creation_date = new Date();
        new_snip.song_name = newSnip.song_name;
        new_snip.url = snipForm.snip_video_id;
        new_snip.user = user;
        new_snip.artist_name = newSnip.artist_name;
        new_snip.album_name = newSnip.album_name;
        new_snip.time_min = snipForm.time_min;
        new_snip.time_max = snipForm.time_max;
        new_snip.thumbnail_url = newSnip.thumbnail_url;

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
            snip.thumbnail_url = track.getImageURL(ImageSize.MEDIUM);
        }

        return snip;
    }

    public static boolean isOwner(final User user, final Snip snip) {
        //Query<Snip> q = MorphiaUtil.getDatastore().find(Snip.class).field("id").equal(snip.id).field("user").equal(user);

        boolean owned = false;
        if(user != null && snip != null) {
            if(user.id.equals(snip.user.id)) {
                owned = true;
            }
        }
        return owned;
    }

    public void favourite() {
        favouriteCount++;
        MorphiaUtil.getDatastore().save(this);
    }

    public void unfavourite() {
        if(favouriteCount > 0) {
            favouriteCount--;
            MorphiaUtil.getDatastore().save(this);
        }
    }

    public static List<Snip> findPopular() {
        return MorphiaUtil.getDatastore().createQuery(Snip.class).order("-favouriteCount").limit(10).asList();
    }

}
