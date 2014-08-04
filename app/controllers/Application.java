package controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.MySniplists;
import models.MySnips;
import models.User;
import org.bson.types.ObjectId;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Response;
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

            result = ok(home.render(js, localUser, following));
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
			// User did not fill everything properly
			return badRequest(login.render(filledForm));
		} else {
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
            MySniplists mySniplists = MySniplists.findByUser(localUser);
            MySnips mySnips = MySnips.findByUser(localUser);

            MySniplists userSniplists = MySniplists.findByUser(userProfile);
            MySnips userSnips = MySnips.findByUser(userProfile);

            result = ok(views.html.account.userProfile.render(js, localUser, mySnips, mySniplists, userProfile, userSnips, userSniplists));
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
                        controllers.routes.javascript.Snips.getVideo(),
                        controllers.routes.javascript.Snips.createSnip(),
                        controllers.routes.javascript.Snips.getSnip(),
                        controllers.routes.javascript.MySnipsController.removeSnip(),
                        controllers.routes.javascript.MySnipsController.saveSnip(),
                        controllers.routes.javascript.MySnipsController.toggleSnip(),
                        controllers.routes.javascript.MySniplistsController.removeSniplist(),
                        controllers.routes.javascript.MySniplistsController.saveSniplist(),
                        controllers.routes.javascript.MySniplistsController.mySniplists(),
                        controllers.routes.javascript.MySniplistsController.toggleSniplist(),
                        controllers.routes.javascript.MySniplistsController.getNextSnip(),
                        controllers.routes.javascript.SnipLists.saveSnipList(),
                        controllers.routes.javascript.SnipLists.addToSnipList(),
                        controllers.routes.javascript.SnipLists.loadSnipListByUser(),
                        controllers.routes.javascript.SnipLists.deleteFromSnipList(),
                        controllers.routes.javascript.SnipLists.viewSnipListsLocalUser(),
                        controllers.routes.javascript.MySnipsController.mySnips(),
                        controllers.routes.javascript.Application.getUserProfile(),
                        controllers.routes.javascript.Application.getUsersFollowing(),
                        controllers.routes.javascript.Application.toggleFollow())
        );
    }

}