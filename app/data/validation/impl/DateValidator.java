package data.validation.impl;

import data.validation.SniplistConstraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Thomas on 8/13/2014.
 */
public class DateValidator implements ConstraintValidator<SniplistConstraints.Date, String>{

        private static String dateFormat;

        @Override
        public void initialize(SniplistConstraints.Date date) {
            if(dateFormat == null) {
                dateFormat = "MM/dd/yyyy";
            }
        }

        @Override
        public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
            boolean valid = false;
            if(s != null) {
                try {
                    stringToDate(s);
                    valid = true;
                } catch (ParseException e) {}
            }
            return valid;
        }

        public static Date stringToDate(final String dateString) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            Date date = simpleDateFormat.parse(dateString);
            return date;
        }

    }

