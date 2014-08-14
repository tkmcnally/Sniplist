package util;

import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Thomas on 7/28/2014.
 */
public class SniplistUtil {

    public static int isoToSeconds(String isoString) {

        PeriodFormatter format = ISOPeriodFormat.standard();
        Period start = format.parsePeriod(isoString);

        return start.toStandardSeconds().getSeconds();
    }

    public static String dateToSimpleString(final Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formatted = simpleDateFormat.format(date);

        if(formatted == null) {
            formatted = "00/00/0000";
        }

        return formatted;
    }

}
