package controllers;

import models.User;
import org.mongodb.morphia.Datastore;
import play.mvc.Controller;
import play.mvc.Result;

import util.MorphiaUtil;
import views.html.index;

import java.util.Calendar;

/**
 * Created by Thomas on 5/26/2014.
 */
public class Application extends Controller {

    public static Result index() {

        return ok(index.render(Calendar.getInstance().getTime().toString()));
    }

}
