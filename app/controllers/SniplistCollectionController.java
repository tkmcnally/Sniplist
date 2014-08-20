package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thomas on 7/29/2014.
 */
public class SniplistCollectionController extends Controller {

    @Restrict(@Group(Application.USER_ROLE))
    public static Result removeSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Sniplist sniplist = Sniplist.findById(id);
        SniplistCollection sniplistCollection = SniplistCollection.findByUser(user);
        if(sniplist != null && sniplistCollection != null) {

            boolean removed = SniplistCollection.removeSniplist(sniplistCollection, sniplist);

            if(removed) {
                node.put("message", "Sniplist '" + sniplist.name + "' has been removed from your collection!");
                result = ok(node);
            } else {
                node.put("error", "Sniplist '" + sniplist.name + "' could not be found in your collection!");
                result = badRequest(node);
            }
        } else {
            node.put("error", "Could not find that snip.");
            badRequest(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result saveSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Sniplist sniplist = Sniplist.findById(id);
        SniplistCollection sniplistCollection = SniplistCollection.findByUser(user);

        if(sniplist != null && sniplistCollection != null) {

            boolean saved = SniplistCollection.addSniplist(sniplistCollection, sniplist);

            if(saved) {
                result = ok();
            } else {
                node.put("error", "Your collection is full!");
                result = badRequest(node);
            }

        } else {
            node.put("error", "Could not find Snip with id: '" + sniplist.id + "'.");
            result = badRequest(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result mySniplists() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User localUser = Application.getLocalUser(session());

        SnipCollection mySnips = SnipCollection.findByUser(localUser);
        SniplistCollection mySniplists = SniplistCollection.findByUser(localUser);
        List<Sniplist> savedSniplists = new ArrayList<Sniplist>();
        savedSniplists.addAll(mySniplists.savedSniplists);
        for(Sniplist s: savedSniplists) {
            if(!s.user.id.equals(localUser.id)) {
                mySniplists.savedSniplists.remove(s);
            }
        }

        return ok(views.html.sniplist.sniplists.render(js, localUser, mySnips, mySniplists, mySniplists));
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result favouritedSniplists() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User localUser = Application.getLocalUser(session());

        SnipCollection mySnips = SnipCollection.findByUser(localUser);
        SniplistCollection mySniplists = SniplistCollection.findByUser(localUser);
        List<Sniplist> savedSniplists = new ArrayList<Sniplist>();
        savedSniplists.addAll(mySniplists.savedSniplists);
        for(Sniplist s: savedSniplists) {
            if(s.user.id.equals(localUser.id)) {
                mySniplists.savedSniplists.remove(s);
            }
        }

        return ok(views.html.sniplist.sniplists.render(js, localUser, mySnips, mySniplists, mySniplists));
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result toggleSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Sniplist sniplist = Sniplist.findById(id);
        SniplistCollection sniplistCollection = SniplistCollection.findByUser(user);

        if(sniplist != null && sniplistCollection != null) {
            if(SniplistCollection.toggleSniplist(sniplistCollection, sniplist)) {
                node.put("message","Sniplist '" + sniplist.name + "' has been favourited.");
            } else {
                node.put("message","Sniplist '" + sniplist.name + "' has been unfavourited.");
            }
            result = ok(node);
        } else {

            node.put("error", "Could not find Sniplist with id: '" + sniplist.id + "'.");
            result = badRequest(node);
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result getNextSnip() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();
        JsonNode json = request().body().asJson();
        String playlistType = json.findPath("playlistType").textValue();


        Snip nextSnip = null;
        Snip snip = Snip.findById(json.findPath("snip_id").textValue());
        int index = 100;
        User owner = null;
        String sniplist_name = null;
        if(Constants.Snips.SNIPLIST.equals(playlistType)) {
            Sniplist sniplist = Sniplist.findById(json.findPath("list_id").textValue());


            for(Snip s: sniplist.snips) {
                if(s.id.equals(snip.id)) {
                    index = sniplist.snips.indexOf(s);
                }
            }
            if(index < sniplist.snips.size() - 1) {
                index++;
            } else {
                index = 0;
            }

            nextSnip = sniplist.snips.get(index);
            owner = sniplist.user;
            sniplist_name = sniplist.name;

        } else {
            SnipCollection snipCollection = SnipCollection.findById(json.findPath("list_id").textValue());
            for(Snip s: snipCollection.savedSnips) {
                if(s.id.equals(snip.id)) {
                    index = snipCollection.savedSnips.indexOf(s);
                }
            }

            if(index < snipCollection.savedSnips.size() - 1) {
                index++;
            } else {
                index = 0;
            }

            nextSnip = snipCollection.savedSnips.get(index);
            owner = snipCollection.user;
        }

        SnipCollection snipCollection = SnipCollection.findByUser(user);
        boolean isFavourited = SnipCollection.isFavourited(snipCollection, nextSnip);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("title", nextSnip.song_name);
        node.put("artist", nextSnip.artist_name);
        node.put("album", nextSnip.album_name);
        node.put("video_id", nextSnip.url);
        node.put("snip_id", nextSnip.id.toString());
        node.put("start_time", nextSnip.time_min);
        node.put("end_time", nextSnip.time_max);
        node.put("favourite", isFavourited);
        node.put("user_id", owner.id.toString());
        node.put("user_name", owner.name);
        node.put("sniplist_name", sniplist_name);
        if(index == 0) {
            node.put("autoPlay", false);
        } else {
            node.put("autoPlay", true);
        }


        result = ok(node);


        return result;
    }
}
