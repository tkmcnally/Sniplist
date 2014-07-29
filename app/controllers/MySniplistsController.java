package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Thomas on 7/29/2014.
 */
public class MySniplistsController extends Controller {

    @Restrict(@Group(Application.USER_ROLE))
    public static Result removeSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        SnipList snipList = SnipList.findById(id).get();
        MySniplists mySniplists = MySniplists.findByUser(user);
        if(snipList != null && mySniplists != null) {

            boolean removed = MySniplists.removeSniplist(mySniplists, snipList);

            if(removed) {
                result = ok("Sniplist '" + snipList.name + "' has been removed from your collection!");
            } else {
                result = badRequest("Sniplist '" + snipList.name + "' could not be found in your collection!");
            }
        } else {
            badRequest("Could not find that snip.");
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result saveSniplist(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        SnipList snipList = SnipList.findById(id).get();
        MySniplists mySniplists = MySniplists.findByUser(user);

        if(snipList != null && mySniplists != null) {

            boolean saved = MySniplists.addSniplist(mySniplists, snipList);

            if(saved) {
                result = ok();
            } else {
                result = badRequest("Your collection is full!");
            }

        } else {
            result = badRequest("Could not find Snip with id: '" + snipList.id + "'.");
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

        Result result = internalServerError();

        SnipList snipList = SnipList.findById(id).get();
        MySniplists mySniplists = MySniplists.findByUser(user);

        if(snipList != null && mySniplists != null) {
            if(MySniplists.toggleSniplist(mySniplists, snipList)) {
                result = ok("Sniplist '" + snipList.name + "' has been favourited.");
            } else {
                result = ok("Sniplist '" + snipList.name + "' has been unfavourited.");
            }
        } else {
            result = badRequest("Could not find Sniplist with id: '" + snipList.id + "'.");
        }

        return result;
    }


   /* @Restrict(@Group(Application.USER_ROLE))
    public static Result toggleSniplist(final String snipList_id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        MySniplists mySniplists = MySniplists.findByUser(user);
        SnipList snipList = SnipList.findById(snipList_id).get();

        if(snipList == null) {
            result = badRequest("Invalid SnipList Id.");
        } else {

            if(MySniplists.isFavourited(mySniplists, snipList)) {
                MySniplists.removeSniplist(mySniplists, snipList);
                result = ok("Sniplist '" + snipList.name + "' has been removed from your collection." );
            } else {
                MySniplists.addSniplist(mySniplists, snipList);
                result = ok("Sniplist '" + snipList.name + "' has been added to your collection." );
            }
        }
        return result;
    }*/

}
