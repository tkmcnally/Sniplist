package service.api.impl;

import de.umass.lastfm.Album;
import de.umass.lastfm.Caller;
import de.umass.lastfm.Track;
import models.Snip;
import play.Play;
import util.Constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Thomas on 6/20/2014.
 */
public class LastFMAPI {

    private final static String API_KEY = play.Play.application().configuration().getString(Constants.LastFM.APIKEY);

    public static Snip executeSearch(String title, String artist) {

        String query = title + " " + artist;

        Caller.getInstance().setUserAgent("tst");
        Caller.getInstance().setDebugMode(true);

        Collection<Track> tracks = Track.search(query, API_KEY);
        List<Track> suggestedInfo = new ArrayList<Track>(tracks);

        Track track = suggestedInfo.get(0);
        if(track != null) {
            track = Track.getInfo(track.getArtist(), track.getMbid(), API_KEY);
        }

        return Snip.mapperLastFM(track);
    }


}
