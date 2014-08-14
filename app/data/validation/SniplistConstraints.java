package data.validation;

import data.validation.impl.DateValidator;

/**
 * Created by Thomas on 8/13/2014.
 */
public interface SniplistConstraints {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @javax.validation.Constraint(validatedBy = {DateValidator.class})
    @play.data.Form.Display(name = "constraint.date", attributes = {})
    public static @interface Date {
        java.lang.String message() default "sniplist.error.date";

        java.lang.Class<?>[] groups() default {};

        java.lang.Class<? extends javax.validation.Payload>[] payload() default {};
    }


}
