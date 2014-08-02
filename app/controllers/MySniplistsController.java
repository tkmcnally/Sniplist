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
import util.Util;

import java.util.List;

/**
 * Created by Thomas on 7/29/2014.
 */
public class MySniplistsController extends Controller {

    @Restrict(@Group(Application.USER_ROLE))
    public static Result removeSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        SnipList snipList = SnipList.findById(id).get();
        MySniplists mySniplists = MySniplists.findByUser(user);
        if(snipList != null && mySniplists != null) {

            boolean removed = MySniplists.removeSniplist(mySniplists, snipList);

            if(removed) {
                node.put("message", "Sniplist '" + snipList.name + "' has been removed from your collection!");
                result = ok(node);
            } else {
                node.put("error", "Sniplist '" + snipList.name + "' could not be found in your collection!");
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

        SnipList snipList = SnipList.findById(id).get();
        MySniplists mySniplists = MySniplists.findByUser(user);

        if(snipList != null && mySniplists != null) {

            boolean saved = MySniplists.addSniplist(mySniplists, snipList);

            if(saved) {
                result = ok();
            } else {
                node.put("error", "Your collection is full!");
                result = badRequest(node);
            }

        } else {
            node.put("error", "Could not find Snip with id: '" + snipList.id + "'.");
            result = badRequest(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result mySniplists() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        MySniplists mySnips = MySniplists.findByUser(user);
        List<SnipList> snipLists = SnipList.findByUser(user);

        return ok();
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result toggleSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        SnipList snipList = SnipList.findById(id).get();
        MySniplists mySniplists = MySniplists.findByUser(user);

        if(snipList != null && mySniplists != null) {
            if(MySniplists.toggleSniplist(mySniplists, snipList)) {
                node.put("message","Sniplist '" + snipList.name + "' has been favourited.");
            } else {
                node.put("message","Sniplist '" + snipList.name + "' has been unfavourited.");
            }
            result = ok(node);
        } else {

            node.put("error", "Could not find Sniplist with id: '" + snipList.id + "'.");
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
        Snip snip = Snip.findById(json.findPath("snip_id").textValue()).get();
        int index = 100;
        User owner = null;
        String sniplist_name = null;
        if(Constants.Snips.SNIPLIST.equals(playlistType)) {
            SnipList snipList = SnipList.findById(json.findPath("list_id").textValue()).get();


            for(Snip s: snipList.snips) {
                if(s.id.equals(snip.id)) {
                    index = snipList.snips.indexOf(s);
                }
            }
            if(index < snipList.snips.size() - 1) {
                index++;
            } else {
                index = 0;
            }

            nextSnip = snipList.snips.get(index);
            owner = snipList.user;
            sniplist_name = snipList.name;

        } else {
            MySnips mySnips = MySnips.findById(json.findPath("list_id").textValue());
            for(Snip s: mySnips.savedSnips) {
                if(s.id.equals(snip.id)) {
                    index = mySnips.savedSnips.indexOf(s);
                }
            }

            if(index < mySnips.savedSnips.size() - 1) {
                index++;
            } else {
                index = 0;
            }

            nextSnip = mySnips.savedSnips.get(index);
            owner = mySnips.user;
        }

        MySnips mySnips = MySnips.findByUser(user);
        boolean isFavourited = MySnips.isFavourited(mySnips, nextSnip);

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
