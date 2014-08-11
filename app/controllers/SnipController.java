package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Video;
import models.SnipCollection;
import models.Snip;
import models.User;
import play.data.Form;
import play.data.validation.Constraints;
import play.mvc.Controller;
import play.mvc.Result;
import service.api.impl.LastFMAPI;
import service.api.impl.YoutubeVideoAPI;

import java.util.*;

import util.SniplistUtil;

import static play.data.Form.*;

/**
 * Created by Thomas on 6/16/2014.
 */
public class SnipController extends Controller {

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

        public String thumbnail_url;

        public String validate() {
            if (snip_title == null || YoutubeVideoAPI.executeSearch(snip_video_id).size() == 0) {
                return "Invalid Youtube URL." + " title: " + snip_title + " size : " + YoutubeVideoAPI.executeSearch(snip_video_id).size();
            }
            return null;
        }
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result add() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());



        return ok(views.html.snip.addSnip.render(js, user));
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result createSnip() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        final Form<MySnip> snipForm = MY_SNIP_FORM.bindFromRequest();
        if(snipForm.hasErrors()) {
            result = badRequest(snipForm.errorsAsJson());
        } else {
            Snip snip = Snip.create(snipForm.get(), user);

            SnipCollection snipCollection = SnipCollection.findByUser(user);
            SnipCollection.addSnip(snipCollection, snip);

            result = ok();
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
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

            Snip snip = LastFMAPI.executeSearch(result.getSnippet().getTitle(), "");



            ObjectMapper mapper = new ObjectMapper();
            ObjectNode node = mapper.createObjectNode();
            node.put("title", snip.song_name);
            node.put("artist", snip.artist_name);
            node.put("album", snip.album_name);
            node.put("video_id", result.getId().getVideoId());
            node.put("duration", SniplistUtil.isoToSeconds(video.getContentDetails().getDuration()));
            node.put("thumbnail_url", snip.thumbnail_url);


            responseResult = ok(node);

        }
        return responseResult;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result getSnip(final String id) {
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        SnipCollection snipCollection = SnipCollection.findByUser(user);

        Snip snip = Snip.findById(id).get();

        Result result = badRequest();
        if(snip != null) {
            boolean isFavourited = SnipCollection.isFavourited(snipCollection, snip);


            node.put("title", snip.song_name);
            node.put("artist", snip.artist_name);
            node.put("album", snip.album_name);
            node.put("video_id", snip.url);
            node.put("snip_id", snip.id.toString());
            node.put("start_time", snip.time_min);
            node.put("end_time", snip.time_max);
            node.put("favourite", isFavourited);

            result = ok(node);
        } else {
            node.put("error", "Invalid Snip!");
            result = badRequest();
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSnipById(final String id) {
        final User user = Application.getLocalUser(session());
        Snip snip = Snip.findById(id).get();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();
        if(snip != null) {
            result = ok(views.html.snip.viewSnipDirect.render(false, user, snip));
        } else {
            node.put("error", "Invalid Snip ID: " + id);
            result = badRequest(node);
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result getPopularSnips() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));
        final User localUser = Application.getLocalUser(session());

        Result result = internalServerError();

        List<Snip> topList = Snip.findPopular();

        if(topList != null) {
            result = ok(views.html.snip.popular.render(js, localUser, topList));
        } else {
            result = badRequest();
        }

        return result;
    }

}