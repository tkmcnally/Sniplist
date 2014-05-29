package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.util.Calendar;

/**
 * Created by Thomas on 5/26/2014.
 */
public class Application1 extends Controller {

    public static Result index() {
        return ok(index.render());
    }

}
