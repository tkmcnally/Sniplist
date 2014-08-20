package service.api.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.services.youtube.model.Video;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import play.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 8/16/2014.
 */
public class FreebaseAPI {


    /**
     * Retrieve Freebase topics that match a user-provided query term. Then
     * prompt the user to select a topic and return its topic ID.
     */
    public static ObjectNode getInfo(final Video video) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.createObjectNode();
        ObjectNode returnNode = mapper.createObjectNode();
        List<String> topics = video.getTopicDetails().getTopicIds();
        InputStream instream = null;
        if(video.getTopicDetails().getTopicIds() != null && !video.getTopicDetails().getTopicIds().isEmpty()) {
            for (String topic : topics) {

                // The Freebase Java library does not provide search functionality, so
                // the application needs to call directly against the URL. This code
                // constructs the proper URL, then uses jackson classes to convert the
                // JSON response into a Java object. You can learn more about the
                // Freebase search calls at: http://wiki.freebase.com/wiki/ApiSearch.
                HttpClient httpclient = new DefaultHttpClient();

                String serviceURL = "https://www.googleapis.com/freebase/v1/topic";
                String url = serviceURL + topic;

                HttpResponse httpResponse = httpclient.execute(new HttpGet(url));
                HttpEntity entity = httpResponse.getEntity();

                if (entity != null) {
                    instream = entity.getContent();
                    try {

                        // Convert the JSON to an object. This code does not do an
                        // exact map from JSON to POJO (Plain Old Java object), but
                        // you could create additional classes and use them with the
                        // mapper.readValue() function to get that exact mapping.

                        rootNode = mapper.readValue(instream, JsonNode.class);

                        JsonNode songNode = rootNode.get("property").get("/music/recording/song");
                        JsonNode artistNode = rootNode.get("property").get("/music/recording/artist");
                        if(songNode != null && artistNode != null) {
                            returnNode = mapper.createObjectNode();
                            returnNode.put("title", songNode.get("values").get(0).get("text"));
                            returnNode.put("artist", artistNode.get("values").get(0).get("text"));
                            returnNode.put("topic_id", topic);

                        }

                    } finally {
                        instream.close();
                    }
                }
            }
        }
        return returnNode;
    }
}
