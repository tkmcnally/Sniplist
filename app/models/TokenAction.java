package models;

import java.util.Date;
import java.util.Iterator;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Converters;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Reference;
import org.mongodb.morphia.converters.SimpleValueConverter;
import org.mongodb.morphia.converters.TypeConverter;
import org.mongodb.morphia.mapping.MappedField;
import org.mongodb.morphia.mapping.MappingException;
import org.mongodb.morphia.query.MorphiaIterator;
import org.mongodb.morphia.query.Query;
import play.data.format.Formats;
import util.MorphiaUtil;



@Converters(TokenAction.EnumTypeConverter.class)
@Entity
public class TokenAction {

    public enum Type {
        PASSWORD_RESET,
        EMAIL_VERIFICATION
    }
    @SuppressWarnings({"rawtypes", "unused"})
    static public class EnumTypeConverter extends TypeConverter implements SimpleValueConverter {

        public EnumTypeConverter() { super(Type.class); }

        @Override
        public
        Object decode(Class targetClass, Object fromDBObject, MappedField optionalExtraInfo) throws MappingException {
            if (fromDBObject == null) return null;
            return Type.values()[(Integer) fromDBObject];
        }

        @Override
        public
        Object encode(Object value, MappedField optionalExtraInfo) {
            if (value == null)
                return null;

            return ((Enum) value).ordinal();
        }
    }


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Verification time frame (until the user clicks on the link in the email)
     * in seconds
     * Defaults to one week
     */
    private final static long VERIFICATION_TIME = 7 * 24 * 3600;

    @Id
    public ObjectId id;

    @Indexed(unique = true)
    public String token;

    public User targetUser;

    public Type type;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date created;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date expires;

    public static TokenAction findByToken(final String token, final Type type) {
        return MorphiaUtil.getDatastore().find(TokenAction.class).field("token").equal(token).field("type").equal(type).get();
    }

    public static void deleteByUser(final User u, final Type type) {
        Query q = MorphiaUtil.getDatastore().createQuery(TokenAction.class).field("targetUser.id").equal(u.id).field("type").equal(type);
        MorphiaUtil.getDatastore().delete(q);
    }

    public boolean isValid() {
        return this.expires.after(new Date());
    }

    public static TokenAction create(final Type type, final String token,
                                     final User targetUser) {
        final TokenAction ua = new TokenAction();
        ua.targetUser = targetUser;
        ua.token = token;
        ua.type = type;
        final Date created = new Date();
        ua.created = created;
        ua.expires = new Date(created.getTime() + VERIFICATION_TIME * 1000);
        MorphiaUtil.getDatastore().save(ua);
        return ua;
    }
}