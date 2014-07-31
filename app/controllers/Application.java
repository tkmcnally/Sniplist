package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import models.User;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Response;
import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;

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
		return ok(home.render());
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
                        controllers.routes.javascript.SnipLists.saveSnipList(),
                        controllers.routes.javascript.SnipLists.addToSnipList(),
                        controllers.routes.javascript.SnipLists.loadSnipListByUser(),
                        controllers.routes.javascript.SnipLists.deleteFromSnipList(),
                        controllers.routes.javascript.SnipLists.viewSnipListsLocalUser(),
                        controllers.routes.javascript.MySnipsController.mySnips())
        );
    }

}