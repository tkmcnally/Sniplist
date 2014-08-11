package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Thomas on 7/28/2014.
 */
public class SnipCollectionController extends Controller {

    @Restrict(@Group(Application.USER_ROLE))
    public static Result removeSnip(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Snip snip = Snip.findById(id).get();
        SnipCollection snipCollection = SnipCollection.findByUser(user);
        if(snip != null && snipCollection != null) {

            boolean removed = SnipCollection.removeSnip(snipCollection, snip);

            if(removed) {
                node.put("message", "Snip '" + snip.song_name + "' has been removed from your collection!");
                result = ok(node);
            } else {
                node.put("error", "Snip '" + snip.song_name + "' could not be found in your collection!");
                result = badRequest(node);
            }
        } else {
            node.put("error", "Could not find that snip.");
            badRequest(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result saveSnip(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Snip snip = Snip.findById(id).get();
        SnipCollection snipCollection = SnipCollection.findByUser(user);

        if(snip != null && snipCollection != null) {

            boolean saved = SnipCollection.addSnip(snipCollection, snip);

            if(saved) {
                snip.favourite();
                result = ok();
            } else {
                node.put("error", "Your collection is full!");
                result = badRequest(node);
            }

        } else {
            result = badRequest("Could not find Snip with id: '" + snip.id + "'.");
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result mySnips() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        SnipCollection snipCollection = SnipCollection.findByUser(user);
        List<Sniplist1> sniplists = Sniplist1.findByUser(user);

        return ok(views.html.snip.viewSnips.render(js, user, snipCollection));
    }




    @Restrict(@Group(Application.USER_ROLE))
    public static Result toggleSnip(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Snip snip = Snip.findById(id).get();
        SnipCollection snipCollection = SnipCollection.findByUser(user);

        if(snip != null && snipCollection != null) {
            if(SnipCollection.toggleSnip(snipCollection, snip)) {
                node.put("message", "Snip '" + snip.song_name + "' has been favourited.");
                result = ok(node);
            } else {
                node.put("message", "Snip '" + snip.song_name + "' has been unfavourited.");
                result = ok(node);
            }
        } else {
            result = badRequest("Could not find Snip with id: '" + snip.id + "'.");
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSnipsByUser(final String id) {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        User localUser = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        User user = null;
        if(id != null) {
            user = User.findById(id);
        }

        Result result = internalServerError();
        if(user != null) {
            SnipCollection snipCollection = SnipCollection.findByUser(user);
            result = ok(views.html.snip.viewSnips.render(js, localUser, snipCollection));
        } else {
            node.put("error", "Invalid user id!");
            result = badRequest(node);
        }

        return result;
    }
}
