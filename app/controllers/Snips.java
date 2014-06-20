package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import be.objectify.deadbolt.java.actions.SubjectPresent;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.client.json.Json;
import com.google.api.services.youtube.model.SearchResult;
import models.Snip;
import models.User;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import service.api.VideoAPI;
import service.api.impl.YoutubeVideoAPI;

import java.util.ArrayList;
import java.util.List;

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

        public String validate() {
            if (snip_title == null || YoutubeVideoAPI.executeSearch(snip_video_id).size() == 0) {
                return "Invalid Youtube URL." + " title: " + snip_title + " size : " + YoutubeVideoAPI.executeSearch(snip_video_id).size();
            }
            return null;
        }
    }



    @Restrict(@Group(Application.USER_ROLE))
    public static Result mySnips() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        List<Snip> snips = Snip.findByUser(user);

        return ok(views.html.snips.viewSnips.render(user, snips));
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
            Snip.create(snipForm.get(), user);
            result = ok();
        }

        return result;
    }

    public static Result getVideo(String url) {
        List<SearchResult> results = (List<SearchResult>) YoutubeVideoAPI.executeSearch(url);
        Result responseResult = badRequest();

        if(url.contains(results.get(0).getId().getVideoId()))
        if(results.isEmpty() || !url.contains(results.get(0).getId().getVideoId())) {
            responseResult = badRequest("Invalid URL");
        } else {
            SearchResult result = results.get(0);

            ObjectMapper mapper = new ObjectMapper();

            ObjectNode node = mapper.createObjectNode();
            node.put("title", result.getSnippet().getTitle());
            node.put("video_id", result.getId().getVideoId());

            responseResult = ok(node);
        }

        return responseResult;
    }



}
