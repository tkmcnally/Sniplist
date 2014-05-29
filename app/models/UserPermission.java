package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import be.objectify.deadbolt.core.models.Permission;
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
    public Long id;

    public String value;

    public String getValue() {
        return value;
    }

    public static UserPermission findByValue(String value) {
        return MorphiaUtil.getDatastore().find(UserPermission.class).field("value").equal(value).get();
    }
}