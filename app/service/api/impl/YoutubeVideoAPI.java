package service.api.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoListResponse;
import play.Logger;
import service.api.VideoAPI;
import service.api.YoutubeAuth;
import util.Constants;
import com.google.api.services.youtube.YouTube;

import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Thomas on 6/19/2014.
 */
public class YoutubeVideoAPI {

    private final static String API_KEY = play.Play.application().configuration().getString(Constants.Configuration.YOUTUBE_APIKEY);

    public static YouTube youtube;

    public static void setup() {

    }


    public static List<?> executeSearch(String url) {

        List<?> results = new ArrayList();
        try {

            // This object is used to make YouTube Data API requests. The last
            // argument is required, but since we don't need anything
            // initialized when the HttpRequest is initialized, we override
            // the interface and provide a no-op function.
            youtube = new YouTube.Builder(YoutubeAuth.HTTP_TRANSPORT, YoutubeAuth.JSON_FACTORY, new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException {
                }
            }).setApplicationName("Sniplist").build();

            YouTube.Search.List search = youtube.search().list("id,snippet");

            search.setKey(API_KEY);

            //Must be a video.
            search.setType("video");

            // Must be embeddable.
            search.setVideoEmbeddable("true");

            // Specify return fields.
            search.setFields("items(id/videoId,snippet/title,snippet/thumbnails)");

            //Search query is user's url.
            search.setQ(url);


            // Call the API and print results.
            SearchListResponse searchResponse = search.execute();
            List<SearchResult> searchResultList = searchResponse.getItems();
            results = searchResultList;


        } catch (GoogleJsonResponseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        return results;
    }

    public static List<?> executeVideoSearch(String id) {

        List<?> results = new ArrayList();

        try {

            // This object is used to make YouTube Data API requests. The last
            // argument is required, but since we don't need anything
            // initialized when the HttpRequest is initialized, we override
            // the interface and provide a no-op function.
            youtube = new YouTube.Builder(YoutubeAuth.HTTP_TRANSPORT, YoutubeAuth.JSON_FACTORY, new HttpRequestInitializer() {
                public void initialize(HttpRequest request) throws IOException {
                }
            }).setApplicationName("Sniplist").build();

            YouTube.Videos.List search = youtube.videos().list("id,contentDetails,topicDetails");

            search.setKey(API_KEY);

            // Specify return fields.
            search.setFields("items(contentDetails,topicDetails/topicIds)");

            //Search query is user's url.
            search.setId(id);

            // Call the API and print results.
            VideoListResponse searchResponse = search.execute();
            List<Video> searchResultList = searchResponse.getItems();
            results = searchResultList;

        } catch (GoogleJsonResponseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        return results;
    }

}