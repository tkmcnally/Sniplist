package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Thomas on 7/28/2014.
 */
public class MySnipsController extends Controller {

    @Restrict(@Group(Application.USER_ROLE))
    public static Result removeSnip(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        Snip snip = Snip.findById(id).get();
        MySnips mySnips = MySnips.findByUser(user);
        if(snip != null && mySnips != null) {

            boolean removed = MySnips.removeSnip(mySnips, snip);

            if(removed) {
                result = ok("Snip '" + snip.song_name + "' has been removed from your collection!");
            } else {
                result = badRequest("Snip '" + snip.song_name + "' could not be found in your collection!");
            }
        } else {
            badRequest("Could not find that snip.");
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result saveSnip(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        Snip snip = Snip.findById(id).get();
        MySnips mySnips = MySnips.findByUser(user);

        if(snip != null && mySnips != null) {

            boolean saved = MySnips.addSnip(mySnips, snip);

            if(saved) {
                snip.favourite();
                result = ok();
            } else {
                result = badRequest("Your collection is full!");
            }

        } else {
            result = badRequest("Could not find Snip with id: '" + snip.id + "'.");
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result mySnips() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        MySnips mySnips = MySnips.findByUser(user);
        List<SnipList> snipLists = SnipList.findByUser(user);

        return ok(views.html.snips.viewSnips.render(user, mySnips));
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result toggleSnip(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        Snip snip = Snip.findById(id).get();
        MySnips mySnips = MySnips.findByUser(user);

        if(snip != null && mySnips != null) {
            if(MySnips.toggleSnip(mySnips, snip)) {
                result = ok("Snip '" + snip.song_name + "' has been favourited.");
            } else {
                result = ok("Snip '" + snip.song_name + "' has been unfavourited.");
            }
        } else {
            result = badRequest("Could not find Snip with id: '" + snip.id + "'.");
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSnipsByUser(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        User localUser = Application.getLocalUser(session());

        User user = null;
        if(id != null) {
            user = User.findById(id);
        }

        Result result = internalServerError();
        if(user != null) {
            MySnips mySnips = MySnips.findByUser(user);
            result = ok(views.html.snips.viewSnips.render(localUser, mySnips));
        } else {
            result = badRequest("Invalid user id!");
        }

        return result;
    }
/*
    @Restrict(@Group(Application.USER_ROLE))
    public static Result loadSnipsByUser(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        final User id_user = User.findById(id);

        Result result = internalServerError();
        if(id_user != null) {
            MySnips mySnips = MySnips.findByUser(user);
            result = ok(views.html.sniplists.arraySnips.render(user, mySnips));
        } else {
            result = badRequest("Invalid user id!");
        }

        return result;
    }*/

}
