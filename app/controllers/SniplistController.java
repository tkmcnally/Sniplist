package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import util.MorphiaUtil;

import java.util.List;

import static play.data.Form.form;

/**
 * Created by Thomas on 7/26/2014.
 */
public class SniplistController extends Controller {


    private static final Form<MySnipList> MY_SNIPLIST_FORM = form(MySnipList.class);

    public static class MySnipList {

        public String getSniplist_name() {
            return sniplist_name;
        }

        public void setSniplist_name(String sniplist_name) {
            this.sniplist_name = sniplist_name;
        }

        public String sniplist_name;

        public String validate() {

            if (sniplist_name == null || sniplist_name.length() == 0) {
                return "Invalid SnipList name. Must be 1 or more characters long.";
            }

            if (sniplist_name.length() > 35) {
                return "Invalid SnipList name. Must be less than 35 characters.";
            }

            return null;
        }
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSniplistsByUser(final String id) {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        User localUser = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        User user = null;
        if (id != null) {
            user = User.findById(id);
        } else {
            user = localUser;
        }

        Result result = internalServerError();
        if (user != null) {
            SniplistCollection userSniplists = SniplistCollection.findByUser(user);
            SniplistCollection sniplistCollection = SniplistCollection.findByUser(localUser);

            SnipCollection snipCollection = SnipCollection.findByUser(localUser);

            result = ok(views.html.sniplist.sniplists.render(js, localUser, snipCollection, sniplistCollection, userSniplists));
        } else {
            node.put("error", "Invalid user id!");
            result = badRequest(node);
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSniplists() {
        return viewSniplistsByUser(null);
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result saveSnipList() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        final Form<MySnipList> snipListForm = MY_SNIPLIST_FORM.bindFromRequest();
        if (snipListForm.hasErrors()) {
            node.put("error", snipListForm.globalError().message().toString());
            result = badRequest(node);
        } else {
            Sniplist sniplist = Sniplist.create(snipListForm.get(), user);

            SniplistCollection sniplistCollection = SniplistCollection.findByUser(user);
            SniplistCollection.addSniplist(sniplistCollection, sniplist);


            node.put("message", "Sniplist '" + sniplist.name + "' has been saved!");
            result = ok(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result addToSnipList(final String snipList_id, final String snip_id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Snip snip = Snip.findById(snip_id);
        Sniplist sniplist = Sniplist.findById(snipList_id);

        if (snip == null || sniplist == null) {
            node.put("error", "Invalid Snip/SnipList Id.");
            result = badRequest(node);
        } else if (!Sniplist.isOwner(user, sniplist)) {
            node.put("error", "You do not own that SnipList!");
            result = badRequest(node);
        } else if (sniplist.isFull()) {
            node.put("error", "The Sniplist '" + sniplist.name + "' is full!");
            result = badRequest(node);
        } else {
            Sniplist.addSnipToSnipList(sniplist, snip);

            node.put("message", "'" + snip.song_name + " has been added to '" + sniplist.name + "'.");
            result = ok(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result loadSnipListByUser(final String id) {

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User localUser = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        User user = null;
        if (id != null) {
            user = User.findById(id);
        } else {
            user = localUser;
        }


        Result result = internalServerError();
        if (user != null) {
            SniplistCollection userSniplists = SniplistCollection.findByUser(user);
            SniplistCollection sniplistCollection = SniplistCollection.findByUser(localUser);

            SnipCollection snipCollection = SnipCollection.findByUser(user);

            result = ok(views.html.sniplist.arraySniplists.render(true, user, snipCollection, sniplistCollection, userSniplists));
        } else {

            node.put("error", "Invalid user id!");
            result = badRequest();
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result deleteFromSnipList(final String snipList_id, final String snip_id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        Snip snip = Snip.findById(snip_id);
        Sniplist sniplist = Sniplist.findById(snipList_id);

        if (snip == null || sniplist == null) {
            Logger.info(snip + "  + " + sniplist);
            node.put("error", "Invalid Snip/SnipList Id.");
            result = badRequest(node);
        } else if (!Sniplist.isOwner(user, sniplist)) {
            node.put("error", "You do not own that SnipList!");
            result = badRequest(node);
        } else {
            Sniplist.deleteSnipFromSnipList(sniplist, snip);
            node.put("message", "'" + snip.song_name + "'" + " has been removed from " + sniplist.name + ".");
            result = ok(node);
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSnipListsLocalUser() {

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        SniplistCollection sniplistCollection = SniplistCollection.findByUser(user);

        SniplistCollection filtered = SniplistCollection.copy(sniplistCollection);
        for(Sniplist sl: sniplistCollection.savedSniplists) {
            if(!user.id.equals(sl.user.id)) {
                filtered.savedSniplists.remove(sl);
            }
        }
        if (sniplistCollection != null) {
            result = ok(views.html.sniplist.addSnipToList.render(filtered));
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSniplistById(final String id) {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));
        final User user = Application.getLocalUser(session());
        Sniplist sniplist = Sniplist.findById(id);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();
        if(sniplist != null) {
            result = ok(views.html.sniplist.viewSniplistDirect.render(js, user, sniplist));
        } else {
            node.put("error", "Invalid Sniplist ID: " + id);
            result = badRequest(views.html.badRequest.render(js, node));
        }

        return result;
    }

  /*  @Restrict(@Group(Application.USER_ROLE))
    public static Result getPopularSniplists() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));
        final User localUser = Application.getLocalUser(session());

        Result result = internalServerError();

        List<Sniplist> topList = Sniplist.findPopular();

        if(topList != null) {
            result = ok(views.html.sniplist.popular.render(js, localUser, topList));
        } else {
            result = badRequest();
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result getRecentSniplists() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));
        final User localUser = Application.getLocalUser(session());

        Result result = internalServerError();

        List<Sniplist> topList = Sniplist.findRecent();

        if(topList != null) {
            result = ok(views.html.sniplist.recent.render(js, localUser, topList));
        } else {
            result = badRequest();
        }

        return result;
    }
*/


}

