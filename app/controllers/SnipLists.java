package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
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


            for (SnipList s : userSniplists.savedSniplists) {
                for (Snip sn : s.snips) {
                    if (MySnips.isFavourited(mySnips, sn)) {
                        sn.localUserFavourited = true;
                    }
                }
                if (MySniplists.isFavourited(mySniplists, s)) {
                    s.localUserFavourited = true;
                }
            }


            result = ok(views.html.sniplists.sniplists.render(js, localUser, userSniplists));
        } else {
            result = badRequest("Invalid user id!");
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

        Result result = internalServerError();

        final Form<MySnipList> snipListForm = MY_SNIPLIST_FORM.bindFromRequest();
        if (snipListForm.hasErrors()) {
            result = badRequest(snipListForm.globalError().message().toString());
        } else {
            SnipList snipList = SnipList.create(snipListForm.get(), user);

            MySniplists mySniplists = MySniplists.findByUser(user);
            MySniplists.addSniplist(mySniplists, snipList);

            result = ok("Sniplist '" + snipList.name + "' has been saved!");
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result addToSnipList(final String snipList_id, final String snip_id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        Snip snip = Snip.findById(snip_id).get();
        SnipList snipList = SnipList.findById(snipList_id).get();

        if (snip == null || snipList == null) {
            result = badRequest("Invalid Snip/SnipList Id.");
        } else if (!SnipList.isOwner(user, snipList)) {
            result = badRequest("You do not own that SnipList!");
        } else if (snipList.isFull()) {
            result = badRequest("The Sniplist '" + snipList.name + "' is full!");
        } else {
            SnipList.addSnipToSnipList(snipList, snip);
            result = ok("'" + snip.song_name + " has been added to '" + snipList.name + "'.");
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result loadSnipListByUser(final String id) {

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User localUser = Application.getLocalUser(session());

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


            if (user.id != user.id) {
                for (SnipList s : userSniplists.savedSniplists) {
                    for (Snip sn : s.snips) {
                        if (MySnips.isFavourited(mySnips, sn)) {
                            sn.localUserFavourited = true;
                        }
                    }
                    if (MySniplists.isFavourited(mySniplists, s)) {
                        s.localUserFavourited = true;
                    }
                }
            }
            result = ok(views.html.sniplists.arraySniplists.render(user, userSniplists));
        } else {
            result = badRequest("Invalid user id!");
        }

        return result;
    }


    @Restrict(@Group(Application.USER_ROLE))
    public static Result deleteFromSnipList(final String snipList_id, final String snip_id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final User user = Application.getLocalUser(session());

        Result result = internalServerError();

        Snip snip = Snip.findById(snip_id).get();
        SnipList snipList = SnipList.findById(snipList_id).get();

        if (snip == null || snipList == null) {
            result = badRequest("Invalid Snip/SnipList Id.");
        } else if (!SnipList.isOwner(user, snipList)) {
            result = badRequest("You do not own that SnipList!");
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
}

