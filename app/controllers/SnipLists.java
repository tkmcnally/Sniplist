package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.data.Form;
import play.data.validation.Constraints;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.form;

/**
 * Created by Thomas on 7/26/2014.
 */
public class SnipLists extends Controller {


    private static final Form<MySnipList> MY_SNIPLIST_FORM = form(MySnipList.class);

    public static class MySnipList {

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
            MySniplists userSniplists = MySniplists.findByUser(user);
            MySniplists mySniplists = MySniplists.findByUser(localUser);

            MySnips mySnips = MySnips.findByUser(localUser);

            result = ok(views.html.sniplists.sniplists.render(js, localUser, mySnips, mySniplists, userSniplists));
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
            SnipList snipList = SnipList.create(snipListForm.get(), user);

            MySniplists mySniplists = MySniplists.findByUser(user);
            MySniplists.addSniplist(mySniplists, snipList);


            node.put("message", "Sniplist '" + snipList.name + "' has been saved!");
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

        Snip snip = Snip.findById(snip_id).get();
        SnipList snipList = SnipList.findById(snipList_id).get();

        if (snip == null || snipList == null) {
            node.put("error", "Invalid Snip/SnipList Id.");
            result = badRequest(node);
        } else if (!SnipList.isOwner(user, snipList)) {
            node.put("error", "You do not own that SnipList!");
            result = badRequest(node);
        } else if (snipList.isFull()) {
            node.put("error", "The Sniplist '" + snipList.name + "' is full!");
            result = badRequest(node);
        } else {
            SnipList.addSnipToSnipList(snipList, snip);

            node.put("message", "'" + snip.song_name + " has been added to '" + snipList.name + "'.");
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
            MySniplists userSniplists = MySniplists.findByUser(user);
            MySniplists mySniplists = MySniplists.findByUser(localUser);

            MySnips mySnips = MySnips.findByUser(user);

            result = ok(views.html.sniplists.arraySniplists.render(true, user, mySnips, mySniplists, userSniplists));
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

        Snip snip = Snip.findById(snip_id).get();
        SnipList snipList = SnipList.findById(snipList_id).get();

        if (snip == null || snipList == null) {
            node.put("error", "Invalid Snip/SnipList Id.");
            result = badRequest(node);
        } else if (!SnipList.isOwner(user, snipList)) {
            node.put("error", "You do not own that SnipList!");
            result = badRequest(node);
        } else {
            SnipList.deleteSnipFromSnipList(snipList, snip);
            result = ok();
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result viewSnipListsLocalUser() {

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        MySniplists mySniplists = MySniplists.findByUser(user);
        MySniplists filtered = MySniplists.copy(mySniplists);
        for(SnipList sl: mySniplists.savedSniplists) {
            if(!user.id.equals(sl.user.id)) {
                filtered.savedSniplists.remove(sl);
            }
        }

        if (mySniplists != null) {
            result = ok(views.html.sniplists.addSnipToList.render(filtered));
        }

        return result;
    }

    public static Result viewSniplistById(final String id) {
        final User user = Application.getLocalUser(session());
        SnipList snipList = SnipList.findById(id).get();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();
        if(snipList != null) {


            result = ok(views.html.sniplists.viewSniplistDirect.render(false, user, snipList));
        } else {
            node.put("error", "Invalid Sniplist ID: " + id);
            result = badRequest(node);
        }

        return result;
    }


}

