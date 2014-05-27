package service;

import com.feth.play.module.pa.service.UserServicePlugin;
import com.feth.play.module.pa.user.AuthUser;
import com.feth.play.module.pa.user.AuthUserIdentity;
import play.Application;

/**
 * Created by Thomas on 5/27/2014.
 */
public class MyUserServicePlugin extends UserServicePlugin {

    public MyUserServicePlugin(final Application app) {
        super(app);
    }

    @Override
    public Object save(AuthUser authUser) {
        return null;
    }

    @Override
    public Object getLocalIdentity(AuthUserIdentity identity) {
        return null;
    }

    @Override
    public AuthUser merge(AuthUser newUser, AuthUser oldUser) {
        return null;
    }

    @Override
    public AuthUser link(AuthUser oldUser, AuthUser newUser) {
        return null;
    }
}
