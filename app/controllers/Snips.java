package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import be.objectify.deadbolt.java.actions.SubjectPresent;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.client.json.Json;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Video;
import de.umass.lastfm.Track;
import models.MySnips;
import models.Snip;
import models.SnipList;
import models.User;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import service.api.VideoAPI;
import service.api.impl.LastFMAPI;
import service.api.impl.YoutubeVideoAPI;

import javax.xml.bind.DatatypeConverter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.joda.time.*;
import org.joda.time.format.*;
import util.Util;

import static play.data.Form.*;

/**
 * Created by Thomas on 6/16/2014.
 */
public class Snips extends Controller {

    private static final Form<MySnip> MY_SNIP_FORM = form(MySnip.class);

    public static class MySnip  {

        @Constraints.Required
        public String snip_title;

        @Constraints.Required
        public String snip_video_id;

        public String snip_artist;

        public String snip_album;

        public String time_min;

        public String time_max;

        public String validate() {
            if (snip_title == null || YoutubeVideoAPI.executeSearch(snip_video_id).size() == 0) {
                return "Invalid Youtube URL." + " title: " + snip_title + " size : " + YoutubeVideoAPI.executeSearch(snip_video_id).size();
            }
            return null;
        }
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result add() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        return ok(views.html.snips.addSnip.render(user));
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result saveSnip() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        final Form<MySnip> snipForm = MY_SNIP_FORM.bindFromRequest();
        if(snipForm.hasErrors()) {
            result = badRequest(snipForm.errorsAsJson());
        } else {
            Snip snip = Snip.create(snipForm.get(), user);

            MySnips mySnips = MySnips.findByUser(user);
            MySnips.addSnip(mySnips, snip);

            result = ok();
        }

        return result;
    }

    public static Result getVideo(final String url) {
        List<SearchResult> results = (List<SearchResult>) YoutubeVideoAPI.executeSearch(url);

        final User user = Application.getLocalUser(session());

        Result responseResult = badRequest();
        if (results.isEmpty() || !url.contains(results.get(0).getId().getVideoId())) {
            responseResult = badRequest("Invalid YouTube URL! Please try again.");
        } else {
            SearchResult result = results.get(0);

            List<Video> videos = (List<Video>) YoutubeVideoAPI.executeVideoSearch(result.getId().getVideoId());

            Video video = videos.get(0);

            Snip snip = LastFMAPI.executeSearch(result.getSnippet().getTitle());



            ObjectMapper mapper = new ObjectMapper();
            ObjectNode node = mapper.createObjectNode();
            node.put("title", snip.song_name);
            node.put("artist", snip.artist_name);
            node.put("album", snip.album_name);
            node.put("video_id", result.getId().getVideoId());
            node.put("duration", Util.isoToSeconds(video.getContentDetails().getDuration()));

            responseResult = ok(node);

        }
        return responseResult;
    }

    public static Result getSnip(final String id) {
        final User user = Application.getLocalUser(session());

        MySnips mySnips = MySnips.findByUser(user);

        Snip snip = Snip.findById(id).get();

        Result result = badRequest();
        if(snip != null) {
            boolean isFavourited = MySnips.isFavourited(mySnips, snip);

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode node = mapper.createObjectNode();
            node.put("title", snip.song_name);
            node.put("artist", snip.artist_name);
            node.put("album", snip.album_name);
            node.put("video_id", snip.direct_url);
            node.put("snip_id", snip.id.toString());
            node.put("start_time", snip.time_min);
            node.put("end_time", snip.time_max);
            node.put("favourite", isFavourited);

            result = ok(node);
        } else {
            result = badRequest("Invalid Snip!");
        }

        return result;
    }





}
