package service.api.impl;

import de.umass.lastfm.Album;
import de.umass.lastfm.Caller;
import de.umass.lastfm.Track;
import models.Snip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Thomas on 6/20/2014.
 */
public class LastFMAPI {

    public static Snip executeSearch(String title) {

        Caller.getInstance().setUserAgent("tst");
        Caller.getInstance().setDebugMode(true);

        String key = "bb269a2438ed865a877fea8868c16b7d";
        String user = "tkmcnally";

        Collection<Track> tracks = Track.search(title, key);
        List<Track> suggestedInfo = new ArrayList<Track>(tracks);

        Track track = suggestedInfo.get(0);
        if(track != null) {
            track = Track.getInfo(track.getArtist(), track.getMbid(), key);
        }

        return Snip.mapperLastFM(track);
    }


}
