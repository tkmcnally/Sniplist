package models;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.feth.play.module.pa.user.AuthUser;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Reference;
import util.MorphiaUtil;

@Entity
public class LinkedAccount {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    public ObjectId id = new ObjectId();

    @Reference
    public User user;

    public String providerUserId;
    public String providerKey;

    public static LinkedAccount findByProviderKey(final User user, String key) {
        return MorphiaUtil.getDatastore().find(LinkedAccount.class).field("user").equal(user).field("providerKey").equal(key).get();
    }

    public static LinkedAccount create(final User user, final AuthUser authUser) {
        final LinkedAccount ret = new LinkedAccount();
        ret.update(user, authUser);
        return ret;
    }

    public void update(final User user, final AuthUser authUser) {
        this.providerKey = authUser.getProvider();
        this.providerUserId = authUser.getId();
        this.user = user;
    }

    public static LinkedAccount create(final User user, final LinkedAccount acc) {
        final LinkedAccount ret = new LinkedAccount();
        ret.providerKey = acc.providerKey;
        ret.providerUserId = acc.providerUserId;
        ret.user = user;
        return ret;
    }
}