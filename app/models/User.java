package models;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthUser;
import com.feth.play.module.pa.user.AuthUser;
import com.feth.play.module.pa.user.AuthUserIdentity;
import com.feth.play.module.pa.user.EmailIdentity;
import com.feth.play.module.pa.user.NameIdentity;
import com.feth.play.module.pa.user.FirstLastNameIdentity;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import controllers.Application;
import data.validation.SniplistConstraints;
import data.validation.impl.DateValidator;
import models.TokenAction.Type;
import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.query.Query;
import play.Logger;
import play.data.Form;
import play.data.format.Formats;
import play.data.validation.Constraints;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.mongodb.morphia.annotations.Entity;
import providers.MyUsernamePasswordAuthUser;
import util.Constants;
import util.MorphiaUtil;

import javax.persistence.Transient;

/**
 * Initial version based on work by Steve Chaloner (steve@objectify.be) for
 * Deadbolt2
 */
@Entity("users")
public class User implements Subject {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    public ObjectId id;

    @Constraints.Email
    // if you make this unique, keep in mind that users *must* merge/link their
    // accounts then on signup with additional providers
    // @Column(unique = true)
    public String email;

    public String name;

    public String firstName;

    public String lastName;

    @Formats.DateTime(pattern = "MM-dd-YYYY")
    public Date birthDate;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date lastLogin;

    public boolean active;

    public boolean emailValidated;

    public List<SecurityRole> roles;

    public List<UserPermission> permissions;

    @Reference
    public List<LinkedAccount> linkedAccounts;

    public List<ObjectId> following;

    @Transient
    public List<String> favouriteSnips;

    @Transient
    public List<String> favouriteSniplists;

    public ObjectId photo;


    public static boolean existsByAuthUserIdentity(
            final AuthUserIdentity identity) {
        final Query<User> exp;
        if (identity instanceof UsernamePasswordAuthUser) {
            exp = getUsernamePasswordAuthUserFind((UsernamePasswordAuthUser) identity);
        } else {
            exp = getAuthUserFind(identity);
        }
        return exp.countAll() > 0;
    }

    private static Query<User> getAuthUserFind(
            final AuthUserIdentity identity) {

        Query<LinkedAccount> linkedAccounts = MorphiaUtil.getDatastore().find(LinkedAccount.class).field("providerUserId").equal(identity.getId()).field("providerKey").equal(identity.getProvider());

        ObjectId oid = null;
        if(linkedAccounts.get() != null) {
            oid = linkedAccounts.get().user.id;
        }
        Query<User> users = MorphiaUtil.getDatastore().find(User.class).field("active").equal(true).field("_id").equal(oid);

        return users;

    }

    private static Query<User> getUsernamePasswordAuthUserFind(
            final UsernamePasswordAuthUser identity) {
        Query<User> emailUsers = getEmailUserFind(identity.getEmail());
        Query<LinkedAccount> linkedAccounts = MorphiaUtil.getDatastore().find(LinkedAccount.class).field("providerKey").equal(identity.getProvider());
        emailUsers.and(emailUsers.criteria("linkedAccounts").in(linkedAccounts.asKeyList()));

        return emailUsers;
    }

    private static Query<User> getEmailUserFind(final String email) {
        return MorphiaUtil.getDatastore().find(User.class).field("active").equal(true).field("email").equal(email);
    }

    @Override
    public List<? extends Role> getRoles() {
        return roles;
    }

    @Override
    public List<? extends Permission> getPermissions() {
        return permissions;
    }

    @Override
    public String getIdentifier() {
        return null;
    }

    public static User create(final AuthUser authUser) {
        final User user = new User();
        user.roles = Collections.singletonList(SecurityRole
                .findByRoleName(Constants.Security.USER_ROLE));
        // user.permissions = new ArrayList<UserPermission>();
        // user.permissions.add(UserPermission.findByValue("printers.edit"));
        user.active = true;
        user.lastLogin = new Date();
        user.photo = new ObjectId(Constants.MongoDB.DEFAULT_OBJECT_ID);
        user.linkedAccounts = Collections.singletonList(LinkedAccount
                .create(user, authUser));

        if (authUser instanceof EmailIdentity) {
            final EmailIdentity identity = (EmailIdentity) authUser;
            // Remember, even when getting them from FB & Co., emails should be
            // verified within the application as a security breach there might
            // break your security as well!
            user.email = identity.getEmail();
            user.emailValidated = false;
        }

        if (authUser instanceof NameIdentity) {
            final NameIdentity identity = (NameIdentity) authUser;
            final String name = identity.getName();
            if (name != null) {
                user.name = name;
                user.firstName = name;
            }
        }

        if (authUser instanceof FirstLastNameIdentity) {
            final FirstLastNameIdentity identity = (FirstLastNameIdentity) authUser;
            final String firstName = identity.getFirstName();
            final String lastName = identity.getLastName();
            if (firstName != null) {
                user.firstName = firstName;
            }
            if (lastName != null) {
                user.lastName = lastName;
            }
        }


        MorphiaUtil.getDatastore().save(user);
        MorphiaUtil.getDatastore().save(user.roles);
        MorphiaUtil.getDatastore().save(user.linkedAccounts);

        /* create my snips collection */
        SnipCollection.create(user);
        SniplistCollection.create(user);

        return user;
    }

    public static User findByAuthUserIdentity(final AuthUserIdentity identity) {
        if (identity == null) {
            return null;
        }
        if (identity instanceof UsernamePasswordAuthUser) {
            return findByUsernamePasswordIdentity((UsernamePasswordAuthUser) identity);
        } else {
            return getAuthUserFind(identity).get();
        }
    }

    public static User findByUsernamePasswordIdentity(
            final UsernamePasswordAuthUser identity) {
        return getUsernamePasswordAuthUserFind(identity).get();
    }

    public void merge(final User otherUser) {
        for (final LinkedAccount acc : otherUser.linkedAccounts) {
            this.linkedAccounts.add(LinkedAccount.create(otherUser, acc));
        }
        // do all other merging stuff here - like resources, etc.

        // deactivate the merged user that got added to this one
        otherUser.active = false;
        MorphiaUtil.getDatastore().save(Arrays.asList(new User[] { otherUser, this }));
    }

    public static void merge(final AuthUser oldUser, final AuthUser newUser) {
        User.findByAuthUserIdentity(oldUser).merge(
                User.findByAuthUserIdentity(newUser));
    }

    public static void addLinkedAccount(final AuthUser oldUser,
                                        final AuthUser newUser) {
        final User u = User.findByAuthUserIdentity(oldUser);
        u.linkedAccounts.add(LinkedAccount.create(u, newUser));
        MorphiaUtil.getDatastore().save(u.linkedAccounts);
        MorphiaUtil.getDatastore().save(u);
    }

    public static void removeProvider(final AuthUser user, String oldProviderKey) {
        final User u = User.findByAuthUserIdentity(user);

        for(LinkedAccount la: u.linkedAccounts) {
            if(la.providerKey.equals(oldProviderKey)) {
                u.linkedAccounts.remove(la);
                MorphiaUtil.getDatastore().delete(la);
                break;
            }
        }
        MorphiaUtil.getDatastore().save(u.linkedAccounts);
        MorphiaUtil.getDatastore().save(u);
    }

    public static void setLastLoginDate(final AuthUser knownUser) {
        final User u = User.findByAuthUserIdentity(knownUser);
        u.lastLogin = new Date();
        MorphiaUtil.getDatastore().save(u);
    }

    public static User findByEmail(final String email) {
        return getEmailUserFind(email).get();
    }

    public LinkedAccount getAccountByProvider(final String providerKey) {
        return LinkedAccount.findByProviderKey(this, providerKey);
    }

    public static void verify(final User unverified) {
        // You might want to wrap this into a transaction
        unverified.emailValidated = true;
        MorphiaUtil.getDatastore().save(unverified);

        TokenAction.deleteByUser(unverified, Type.EMAIL_VERIFICATION);
    }

    public Set<String> getProviders() {
        final Set<String> providerKeys = new HashSet<String>(
                linkedAccounts.size());
        for (final LinkedAccount acc : linkedAccounts) {
            providerKeys.add(acc.providerKey);
        }
        return providerKeys;
    }

    public void changePassword(final UsernamePasswordAuthUser authUser,
                               final boolean create) {
        LinkedAccount a = this.getAccountByProvider(authUser.getProvider());
        if (a == null) {
            if (create) {
                a = LinkedAccount.create(this, authUser);
                a.user = this;
            } else {
                throw new RuntimeException(
                        "Account not enabled for password usage");
            }
        }
        a.providerUserId = authUser.getHashedPassword();
        MorphiaUtil.getDatastore().save(a);
    }

    public void resetPassword(final UsernamePasswordAuthUser authUser,
                              final boolean create) {
        // You might want to wrap this into a transaction
        this.changePassword(authUser, create);
        TokenAction.deleteByUser(this, Type.PASSWORD_RESET);
    }

    public static User findById(final String id){
        ObjectId userId = new ObjectId(id);
        return MorphiaUtil.getDatastore().find(User.class).field("active").equal(true).field("id").equal(userId).get();
    }


    public static boolean followUser(final User user, final User followee) {
        if(user.following == null) {
            user.following = new ArrayList<ObjectId>();
        }
        if(user.following.add(followee.id)) {
            MorphiaUtil.getDatastore().save(user);
            return true;
        }

        return false;

    }

    public static boolean unfollowUser(final User user, final User followee) {

        if(user.following != null) {
            if (user.following.remove(followee.id)) {
                MorphiaUtil.getDatastore().save(user);
                return true;
            }
        }
        return false;

    }

    public static boolean isFollowing(final User user, final User follower) {

        if(user.following != null) {
            if (user.following.contains(follower.id)) {
                return true;
            }
        }
        return false;

    }

    public boolean isFull() {
        if(this.following != null) {
            if(this.following.size() >= Constants.User.MAX_FOLLOWING) {
                return true;
            }
        }
        return false;
    }

    public static void updateSettings(final User user, final Form<Application.UserSettings> filledForm) {
        user.firstName = filledForm.data().get("first_name");
        user.lastName = filledForm.data().get("last_name");
        user.email = filledForm.data().get("email");
        try {
            user.birthDate = DateValidator.stringToDate(filledForm.data().get("birth_date"));
        } catch (ParseException e) {}


        String password = filledForm.data().get("password");
        String repeatPassword = filledForm.data().get("repeatPassword");
        if(password != null && repeatPassword != null) {
            if(!password.isEmpty() && !repeatPassword.isEmpty() && password.equals(repeatPassword)) {
                user.changePassword(new MyUsernamePasswordAuthUser(filledForm.data().get("password")),true);
            }
        }

        MorphiaUtil.getDatastore().save(user);
    }

    public static boolean updatePhoto(final User user, final File file, final String fileName, final String contentType) {
        boolean updateSuccess = false;
        GridFS gridFSPhoto = MorphiaUtil.getGridFS();
        try {
            ObjectId existingPhotoId = user.photo;
            ObjectId photoId = new ObjectId();
            user.photo = photoId;
            MorphiaUtil.getDatastore().save(user);

            GridFSInputFile gridFSInputFile = gridFSPhoto.createFile(file);
            gridFSInputFile.setId(photoId);
            if(fileName != null) {
                gridFSInputFile.setFilename(fileName);
            } else {
                gridFSInputFile.setFilename("unknown");
            }
            if(contentType != null) {
                gridFSInputFile.setContentType(contentType);
            } else {
                gridFSInputFile.setContentType("image/png");
            }
            gridFSInputFile.save();

            deleteExistingPhoto(existingPhotoId);

            updateSuccess = true;
        } catch (IOException e) {}

        return updateSuccess;
    }

    public static boolean deleteExistingPhoto(final ObjectId photoId) {
        boolean deleted = false;
        GridFS gridFSPhoto = MorphiaUtil.getGridFS();
        if(!Constants.MongoDB.DEFAULT_OBJECT_ID.equals(photoId.toString())) {
            gridFSPhoto.remove(photoId);
            deleted = true;
        }

        return deleted;
    }

    public void populateFavouriteSnips(final SnipCollection snipCollection) {
        List<String> temp = new ArrayList<String>();
        if(snipCollection.savedSnips != null) {
            for (Snip s : snipCollection.savedSnips) {
                temp.add(s.id.toString());
            }
        }
        favouriteSnips = temp;
    }

    public void populateFavouriteSniplists(final SniplistCollection sniplistCollection) {
        List<String> temp = new ArrayList<String>();
        if(sniplistCollection.savedSniplists != null) {
            for (Sniplist s : sniplistCollection.savedSniplists) {
                temp.add(s.id.toString());
            }
        }
        favouriteSniplists = temp;
    }

    public void populateFavouriteSnips(final List<Snip> snipCollection) {
        List<String> temp = new ArrayList<String>();
        for(Snip s: snipCollection) {
            temp.add(s.id.toString());
        }

        favouriteSnips = temp;
    }

    public void populateFavouriteSniplists(final List<Sniplist> sniplistCollection) {
        List<String> temp = new ArrayList<String>();
        for(Sniplist s: sniplistCollection) {
            temp.add(s.id.toString());
        }

        favouriteSniplists = temp;
    }

}