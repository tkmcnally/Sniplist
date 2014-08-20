package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.JsonNode;
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
import service.api.impl.FreebaseAPI;
import service.api.impl.LastFMAPI;
import service.api.impl.YoutubeVideoAPI;

import java.io.IOException;
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

        public String getSnip_artist() {
            return snip_artist;
        }

        public void setSnip_artist(String snip_artist) {
            this.snip_artist = snip_artist;
        }

        public String getSnip_title() {
            return snip_title;
        }

        public void setSnip_title(String snip_title) {
            this.snip_title = snip_title;
        }

        public String getSnip_video_id() {
            return snip_video_id;
        }

        public void setSnip_video_id(String snip_video_id) {
            this.snip_video_id = snip_video_id;
        }

        public String getSnip_album() {
            return snip_album;
        }

        public void setSnip_album(String snip_album) {
            this.snip_album = snip_album;
        }

        public String getTime_min() {
            return time_min;
        }

        public void setTime_min(String time_min) {
            this.time_min = time_min;
        }

        public String getTime_max() {
            return time_max;
        }

        public void setTime_max(String time_max) {
            this.time_max = time_max;
        }

        public String getThumbnail_url() {
            return thumbnail_url;
        }

        public void setThumbnail_url(String thumbnail_url) {
            this.thumbnail_url = thumbnail_url;
        }

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
            ObjectNode videoNode = null;
            try {
                videoNode = FreebaseAPI.getInfo(video);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Snip snip = new Snip();
            if(videoNode != null) {
                snip = LastFMAPI.executeSearch(String.valueOf(videoNode.get("title")), String.valueOf(videoNode.get("artist")));
            }



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

        Snip snip = Snip.findById(id);

        Result result = badRequest();
        if(snip != null) {
            boolean isFavourited = SnipCollection.isFavourited(snipCollection, snip);
            boolean isOwned = user.id.equals(snip.user.id);

            node.put("title", snip.song_name);
            node.put("artist", snip.artist_name);
            node.put("album", snip.album_name);
            node.put("video_id", snip.url);
            node.put("snip_id", snip.id.toString());
            node.put("start_time", snip.time_min);
            node.put("end_time", snip.time_max);
            node.put("favourite", isFavourited);
            node.put("owned", isOwned);

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
        Snip snip = Snip.findById(id);

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
}
