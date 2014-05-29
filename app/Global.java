import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.exceptions.AccessDeniedException;
import com.feth.play.module.pa.exceptions.AuthException;
import controllers.routes;
import models.SecurityRole;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.mvc.Call;
import util.MorphiaUtil;

import java.util.Arrays;

/**
 * Created by Thomas on 5/26/2014.
 */
public class Global extends GlobalSettings {

    public void onStop() {
        MorphiaUtil.shutdown();
        Logger.info("Application has been stopped.");
    }

    public void onStart(Application app) {
        Logger.info("Application has been started!");

        MorphiaUtil.start();

        Logger.info("Startup initialization complete.");

        PlayAuthenticate.setResolver(new PlayAuthenticate.Resolver() {

            @Override
            public Call login() {
                // Your login page
                return controllers.routes.Application.login();
            }

            @Override
            public Call afterAuth() {
                // The user will be redirected to this page after authentication
                // if no original URL was saved
                return controllers.routes.Application.index();
            }

            @Override
            public Call afterLogout() {
                return controllers.routes.Application.index();
            }

            @Override
            public Call auth(final String provider) {
                // You can provide your own authentication implementation,
                // however the default should be sufficient for most cases
                return com.feth.play.module.pa.controllers.routes.Authenticate.authenticate(provider);
            }

            @Override
            public Call askMerge() {
                return controllers.routes.Account.askMerge();
            }

            @Override
            public Call askLink() {
                return controllers.routes.Account.askLink();
            }

            @Override
            public Call onException(final AuthException e) {
                if (e instanceof AccessDeniedException) {
                    return controllers.routes.Signup.oAuthDenied(((AccessDeniedException) e).getProviderKey());
                }

                // more custom problem handling here...
                return super.onException(e);
            }
        });

        initialData();
    }

    private void initialData() {
        if (MorphiaUtil.getDatastore().find(SecurityRole.class).countAll()== 0) {
            for (final String roleName : Arrays
                    .asList(controllers.Application.USER_ROLE)) {
                final SecurityRole role = new SecurityRole();
                role.roleName = roleName;
                MorphiaUtil.getDatastore().save(role);
            }
        }
    }

}
