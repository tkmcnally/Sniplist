import play.Application;
import play.GlobalSettings;
import play.Logger;
import util.MorphiaUtil;

/**
 * Created by Thomas on 5/26/2014.
 */
public class Global extends GlobalSettings {

    public void onStart(Application app) {
        Logger.info("Application has been started!");

        MorphiaUtil.start();

        Logger.info("Startup initialization complete.");
    }

    public void onStop() {
        MorphiaUtil.shutdown();
        Logger.info("Application has been stopped.");
    }

}
