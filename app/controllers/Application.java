package controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import org.bson.types.ObjectId;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;

import util.Constants;
import views.html.*;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;

public class Application extends Controller {

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";
	
	public static Result index() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));
        final User localUser = Application.getLocalUser(session());

        Result result = internalServerError();
        if(localUser != null) {
            List<User> following = new ArrayList<User>();
            if(localUser.following != null) {
                for (ObjectId oid : localUser.following) {
                    following.add(User.findById(oid.toString()));
                }
            }

            List<Snip> topSnips = Snip.findPopular();
            List<Sniplist> topSniplists = Sniplist.findPopular();

            result = ok(home.render(js, localUser, following, topSnips, topSniplists));
        } else {
            result = ok(splash.render());
        }

        return result;
	}

    public static Result about() {

        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        return ok(about.render(js));
    }

    public static Result contact() {

        boolean js = "application/javascript".equals(request().getHeader("content-type"));
        return ok(contact.render(js));
    }

    public static User getLocalUser(final Session session) {
		final AuthUser currentAuthUser = PlayAuthenticate.getUser(session);
		final User localUser = User.findByAuthUserIdentity(currentAuthUser);

        return localUser;

	}

	@Restrict(@Group(Application.USER_ROLE))
	public static Result restricted() {
		final User localUser = getLocalUser(session());
		return ok(restricted.render(localUser));
	}

	@Restrict(@Group(Application.USER_ROLE))
	public static Result profile() {
        boolean js = "application/javascript".equals(request().getHeader("content-type"));

		final User localUser = getLocalUser(session());
		return ok(profile.render(js, localUser));
	}

	public static Result login() {
		return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
	}

	public static Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
            System.out.println("!" + filledForm.errors());
			// User did not fill everything properly
			return badRequest(login.render(filledForm));
		} else {
            System.out.println("2" + filledForm.errors());
			// Everything was filled
			return UsernamePasswordAuthProvider.handleLogin(ctx());
		}
	}

	public static Result signup() {

        return ok(signup.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	}

	public static Result jsRoutes() {
		return ok(
				Routes.javascriptRouter("jsRoutes",
						controllers.routes.javascript.Signup.forgotPassword()))
				.as("text/javascript");
	}

	public static Result doSignup() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MySignup> filledForm = MyUsernamePasswordAuthProvider.SIGNUP_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(signup.render(filledForm));
		} else {
			// Everything was filled
			// do something with your part of the form before handling the user
			// signup
			return UsernamePasswordAuthProvider.handleSignup(ctx());
		}
	}

    @Restrict(@Group(Application.USER_ROLE))
    public static Result toggleFollow(final String id) {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());

        User localUser = Application.getLocalUser(session());
        User followee = User.findById(id);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();

        if(followee != null) {

            if(User.isFollowing(localUser, followee)) {
                User.unfollowUser(localUser, followee);
                node.put("message", "User " + id + " has been unfollowed!");
                node.put("following", false);
            } else {
                if(!localUser.isFull()) {
                    User.followUser(localUser, followee);
                    node.put("message", "User " + id + " has been followed!");
                    node.put("following", true);
                } else {
                    node.put("message", "You cannot follow more than " + Constants.User.MAX_FOLLOWING + " users!");
                    node.put("following", false);
                }

            }

            result = ok(node);

        } else {
            node.put("error", "Invalid followee ID: " + id + ".");
            result = badRequest(node);
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result getUsersFollowing() {
        User localUser = Application.getLocalUser(session());

        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        List<User> following = new ArrayList<User>();
        if(localUser.following != null) {
            for (ObjectId oid : localUser.following) {
                following.add(User.findById(oid.toString()));
            }
        }

        return ok(views.html.account.following.render(js, localUser, following));
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result getUserProfile(final String id) {

        boolean js = "application/javascript".equals(request().getHeader("content-type"));

        User localUser = Application.getLocalUser(session());
        User userProfile = User.findById(id);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        Result result = internalServerError();
        if(userProfile != null) {
            SniplistCollection sniplistCollection = SniplistCollection.findByUser(localUser);
            SnipCollection snipCollection = SnipCollection.findByUser(localUser);

            SniplistCollection userSniplists = SniplistCollection.findByUser(userProfile);
            SnipCollection userSnips = SnipCollection.findByUser(userProfile);

            result = ok(views.html.account.userProfile.render(js, localUser, snipCollection, sniplistCollection, userProfile, userSnips, userSniplists));
        } else {
            result = badRequest(node);
        }

        return result;
    }

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}

    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(
                Routes.javascriptRouter("jsRoutes",
                        controllers.routes.javascript.SnipController.getVideo(),
                        controllers.routes.javascript.SnipController.createSnip(),
                        controllers.routes.javascript.SnipController.getSnip(),
                        controllers.routes.javascript.SnipController.getPopularSnips(),
                        controllers.routes.javascript.SnipCollectionController.removeSnip(),
                        controllers.routes.javascript.SnipCollectionController.saveSnip(),
                        controllers.routes.javascript.SnipCollectionController.toggleSnip(),
                        controllers.routes.javascript.SniplistCollectionController.removeSniplist(),
                        controllers.routes.javascript.SniplistCollectionController.saveSniplist(),
                        controllers.routes.javascript.SniplistCollectionController.mySniplists(),
                        controllers.routes.javascript.SniplistCollectionController.toggleSniplist(),
                        controllers.routes.javascript.SniplistCollectionController.getNextSnip(),
                        controllers.routes.javascript.SniplistController.saveSnipList(),
                        controllers.routes.javascript.SniplistController.addToSnipList(),
                        controllers.routes.javascript.SniplistController.loadSnipListByUser(),
                        controllers.routes.javascript.SniplistController.deleteFromSnipList(),
                        controllers.routes.javascript.SniplistController.viewSnipListsLocalUser(),
                        controllers.routes.javascript.SniplistController.getPopularSniplists(),
                        controllers.routes.javascript.SnipCollectionController.mySnips(),
                        controllers.routes.javascript.Application.getUserProfile(),
                        controllers.routes.javascript.Application.getUsersFollowing(),
                        controllers.routes.javascript.Application.toggleFollow())
        );
    }

}