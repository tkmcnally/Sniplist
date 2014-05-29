package models;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import be.objectify.deadbolt.core.models.Permission;
import org.bson.types.ObjectId;
import util.MorphiaUtil;

/**
 * Initial version based on work by Steve Chaloner (steve@objectify.be) for
 * Deadbolt2
 */
@Entity
public class UserPermission implements Permission {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    public ObjectId id;

    public String value;

    public String getValue() {
        return value;
    }

    public static UserPermission findByValue(String value) {
        return MorphiaUtil.getDatastore().find(UserPermission.class).field("value").equal(value).get();
    }
}