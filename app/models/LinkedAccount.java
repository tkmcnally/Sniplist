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
    public ObjectId id;

    @Reference
    public User user;

    public String providerUserId;
    public String providerKey;

    public static LinkedAccount findByProviderKey(final User user, String key) {
        System.out.println("USER: " + user.name + " PROVIER: " + key);
        //return MorphiaUtil.getDatastore().find(LinkedAccount.class).field("user").equal(user).field("providerKey").equal(key).get();
        return null;
    }

    public static LinkedAccount create(final AuthUser authUser) {
        final LinkedAccount ret = new LinkedAccount();
        ret.update(authUser);
        return ret;
    }

    public void update(final AuthUser authUser) {
        this.providerKey = authUser.getProvider();
        this.providerUserId = authUser.getId();
    }

    public static LinkedAccount create(final LinkedAccount acc) {
        final LinkedAccount ret = new LinkedAccount();
        ret.providerKey = acc.providerKey;
        ret.providerUserId = acc.providerUserId;

        return ret;
    }
}