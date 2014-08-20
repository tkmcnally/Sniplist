package controllers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

import be.objectify.deadbolt.java.actions.SubjectPresent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import data.validation.SniplistConstraints;
import models.*;
import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import play.Logger;
import play.Routes;
import play.data.DynamicForm;
import play.data.Form;
import play.data.validation.Constraints;
import play.i18n.Messages;
import play.mvc.*;
import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;

import util.Constants;
import util.MorphiaUtil;
import util.SniplistUtil;
import views.html.*;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;

import static play.data.Form.form;

public class Application extends Controller {


    public static class UserSettings {

        @Constraints.Required
        public String first_name;

        public String last_name;

        @Constraints.Required
        @Constraints.Email
        public String email;

        @Constraints.Required
        @SniplistConstraints.Date
        public String birth_date;

        @Constraints.MinLength(5)
        public String password;

        @Constraints.MinLength(5)
        public String repeatPassword;

        public String validate() {

            String validationMsg = null;
            if(password != null && repeatPassword != null) {
                if (!password.equals(repeatPassword)) {
                    validationMsg = Messages.get("playauthenticate.change_password.error.passwords_not_same");
                }
            } else if(password != null || repeatPassword != null) {
                validationMsg = Messages.get("playauthenticate.change_password.error.passwords_not_same");
            }

            return validationMsg;
        }

        public void bindFromUser(final User user) {
            this.first_name = user.firstName;
            this.last_name = user.lastName;
            this.email = user.email;
            if(user.birthDate != null) {
                this.birth_date = SniplistUtil.dateToSimpleString(user.birthDate);
            }
        }

        public Map<String, String> toMap() {
            Map<String, String> settingsMap = new HashMap<String,String>();
            UserSettings s = this;
            for(Field f : s.getClass().getFields()) {
                try {
                    settingsMap.put(f.getName(), (f.get(s) == null) ? "" : f.get(s).toString());
                } catch (IllegalAccessException e) {
                    settingsMap.clear();
                }
            }
            return settingsMap;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getBirth_date() {
            return birth_date;
        }

        public void setBirth_date(String birth_date) {
            this.birth_date = birth_date;
        }

        public String getRepeatPassword() {
            return repeatPassword;
        }

        public void setRepeatPassword(String repeatPassword) {
            this.repeatPassword = repeatPassword;
        }
    }

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";

    private static final Form<UserSettings> USER_SETTINGS_FORM = form(UserSettings.class);

	public static Result index() {
        final User localUser = Application.getLocalUser(session());
        Result result = internalServerError();
        if(localUser != null) {
            result = popular();
        } else {
            result = ok(splash.render());
        }

        return result;
	}

    @Restrict(@Group(Application.USER_ROLE))
    public static Result popular() {
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


            localUser.populateFavouriteSnips(SnipCollection.findByUser(localUser));

            localUser.populateFavouriteSniplists(SniplistCollection.findByUser(localUser));

            result = ok(viewPopular.render(js, localUser, following, topSnips, topSniplists));
        } else {
            result = ok(splash.render());
        }

        return result;
    }

    @Restrict(@Group(Application.USER_ROLE))
    public static Result recent() {
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

            List<Snip> recentSnips = Snip.findRecent();
            List<Sniplist> recentSniplists = Sniplist.findRecent();

            localUser.populateFavouriteSnips(SnipCollection.findByUser(localUser));
            localUser.populateFavouriteSniplists(SniplistCollection.findByUser(localUser));

            result = ok(viewRecent.render(js, localUser, following, recentSnips, recentSniplists));
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

        UserSettings userSettings = new UserSettings();
        userSettings.bindFromUser(localUser);

        final Form<DynamicForm.Dynamic> userSettingsForm = form().bind(userSettings.toMap());

		return ok(profile.render(js, userSettingsForm, localUser));
	}

	public static Result login() {
		return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
	}

	public static Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
				.bindFromRequest();
        Logger.info(filledForm.toString());
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
            SniplistCollection sniplistCollection = SniplistCollection.findByUser(localUser);
            SnipCollection snipCollection = SnipCollection.findByUser(localUser);

            SniplistCollection userSniplists = SniplistCollection.findByUser(userProfile);
            SnipCollection userSnips = SnipCollection.findByUser(userProfile);

            result = ok(views.html.account.userProfile.render(js, localUser, snipCollection, sniplistCollection, userProfile, userSnips, userSniplists));
        } else {
            node.put("error","Invalid User ID! id: [" + id + "]");
            result = badRequest(views.html.badRequest.render(js, node));
        }

        return result;
    }

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}

    @SubjectPresent
    public static Result updateUserSettings() {

        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        play.mvc.Http.MultipartFormData body = request().body().asMultipartFormData();

        Result result = internalServerError();
        final User localUser = Application.getLocalUser(session());
        final Form<UserSettings> filledForm = USER_SETTINGS_FORM.bindFromRequest();
        if(!filledForm.hasErrors()) {
            User.updateSettings(localUser, filledForm);
        }
        result = ok(views.html.profile.render(true, filledForm, localUser));

        return result;
    }

    @SubjectPresent
    @BodyParser.Of(value = BodyParser.MultipartFormData.class, maxLength = 3000 * 1024)
    public static Result updateUserPhoto() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());

        Result result = internalServerError();
        final User localUser = Application.getLocalUser(session());

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        if(!request().body().isMaxSizeExceeded()){
            play.mvc.Http.MultipartFormData body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart picture = body.getFile("profilePhoto");
            if (picture != null) {

                String fileName = picture.getFilename();
                String contentType = picture.getContentType();
                File file = picture.getFile();
                User.updatePhoto(localUser, file, fileName, contentType);
            }
            node.put("message","Photo updated!");
            node.put("url","" + routes.Application.getImage(localUser.photo.toString()));
            result = ok(node);
        } else {
            node.put("error","You cannot upload an image larger than 3MB.");
            result = status(422, node);

        }

        return result;
    }

    public static Result getImage(final String imageId) {
        Result result = internalServerError();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("error", "Invalid Image ID!");
        result = badRequest(node);
       if(imageId != null && !imageId.isEmpty()) {
           byte[] rawImage = getRawImage(imageId);
           if (rawImage != null) {
               result = ok(rawImage).as("image");
           }
       }
        return result;
    }

    public static byte[] getRawImage(final String imageId) {
        byte[] rawImage = null;
        GridFS gridFSPhoto = MorphiaUtil.getGridFS();
        GridFSDBFile gridFSDBFile = gridFSPhoto.findOne(new ObjectId(imageId));

        ByteArrayOutputStream bOS = new ByteArrayOutputStream();
        try {
            gridFSDBFile.writeTo(bOS);
            rawImage = bOS.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rawImage;
    }


    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(
                Routes.javascriptRouter("jsRoutes",
                        controllers.routes.javascript.SnipController.getVideo(),
                        controllers.routes.javascript.SnipController.createSnip(),
                        controllers.routes.javascript.SnipController.getSnip(),
                        //controllers.routes.javascript.SnipController.getPopularSnips(),
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
                       // controllers.routes.javascript.SniplistController.getPopularSniplists(),
                        controllers.routes.javascript.SnipCollectionController.mySnips(),
                        controllers.routes.javascript.Application.getUserProfile(),
                        controllers.routes.javascript.Application.getUsersFollowing(),
                        controllers.routes.javascript.Application.toggleFollow())
        );
    }

}