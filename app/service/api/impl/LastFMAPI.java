package service.api.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.services.youtube.model.Video;
import de.umass.lastfm.Album;
import de.umass.lastfm.Caller;
import de.umass.lastfm.Track;
import models.Snip;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.Play;
import util.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
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

        title = title.replace("\"", "");
        artist = artist.replace("\"", "");
        Track track = Track.getInfo(artist, title, null, null, API_KEY);

        return Snip.mapperLastFM(track);
    }


    /**
     * Retrieve Freebase topics that match a user-provided query term. Then
     * prompt the user to select a topic and return its topic ID.
     */
    public static Snip getTrack(final String title, final String artist) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.createObjectNode();
        ObjectNode returnNode = mapper.createObjectNode();

        InputStream instream = null;

        if(title != null && artist != null) {


            // The Freebase Java library does not provide search functionality, so
            // the application needs to call directly against the URL. This code
            // constructs the proper URL, then uses jackson classes to convert the
            // JSON response into a Java object. You can learn more about the
            // Freebase search calls at: http://wiki.freebase.com/wiki/ApiSearch.
            HttpClient httpclient = new DefaultHttpClient();

            String serviceURL = "http://ws.audioscrobbler.com/2.0/";
            StringBuilder requestURL = new StringBuilder(serviceURL);
            requestURL.append("?method=track.getInfo");
            requestURL.append("&api_key=" +  URLEncoder.encode(API_KEY, "UTF-8"));
            requestURL.append("&artist=" +  URLEncoder.encode(artist, "UTF-8"));
            requestURL.append("&track=" +  URLEncoder.encode(title, "UTF-8"));
            requestURL.append("&format=json");

            HttpResponse httpResponse = httpclient.execute(new HttpGet(requestURL.toString()));
            HttpEntity entity = httpResponse.getEntity();

            if (entity != null) {
                instream = entity.getContent();
                try {

                    // Convert the JSON to an object. This code does not do an
                    // exact map from JSON to POJO (Plain Old Java object), but
                    // you could create additional classes and use them with the
                    // mapper.readValue() function to get that exact mapping.

                    rootNode = mapper.readValue(instream, JsonNode.class);
                    String trackId = "", trackName = "", artistName = "", albumName = "", thumbnail = "";
                    try {
                        trackId = String.valueOf(rootNode.get("track").get("mbid"));
                    } catch(NullPointerException np) {}

                    try {
                        trackName = String.valueOf(rootNode.get("track").get("name"));
                    } catch(NullPointerException np) {}

                    try {
                        artistName = String.valueOf(rootNode.get("track").get("name"));
                    } catch(NullPointerException np) {}

                    try {
                        albumName = String.valueOf(rootNode.get("album").get("title"));
                    } catch(NullPointerException np) {}

                    try {
                        thumbnail = String.valueOf(rootNode.get("image").get("#text"));
                    } catch(NullPointerException np) {}


                    returnNode.put("id", trackId);
                    returnNode.put("track", trackName);
                    returnNode.put("artist", artistName);
                    returnNode.put("album", albumName);
                    returnNode.put("thumbnail", thumbnail);

                } finally {
                    instream.close();
                }
            }
        }

        return Snip.mapperLastFM(returnNode);
    }


}
