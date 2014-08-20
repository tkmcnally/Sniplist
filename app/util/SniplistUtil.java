package util;

import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

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


    public static String timeElapsed(final Date date) {

        Interval interval = new Interval(date.getTime(), new Date().getTime());
        Period period = interval.toPeriod();

        PeriodFormatter formatter;

        if(period.getYears() > 1) {
            formatter= new PeriodFormatterBuilder().appendYears().appendSuffix(" years ago").printZeroNever().toFormatter();
        } else if(period.getWeeks() > 1) {
            formatter= new PeriodFormatterBuilder().appendWeeks().appendSuffix(" weeks ago").printZeroNever().toFormatter();
        } else if(period.getDays() > 1) {
            formatter= new PeriodFormatterBuilder().appendDays().appendSuffix(" days ago").printZeroNever().toFormatter();
        } else if(period.getHours() > 1) {
            formatter= new PeriodFormatterBuilder().appendHours().appendSuffix(" hours ago").printZeroNever().toFormatter();
        } else if(period.getMinutes() > 1) {
            formatter= new PeriodFormatterBuilder().appendMinutes().appendSuffix(" minutes ago").printZeroNever().toFormatter();
        } else if(period.getSeconds() > 1) {
            formatter= new PeriodFormatterBuilder().appendSeconds().appendSuffix(" seconds ago").printZeroNever().toFormatter();
        } else {
            formatter= new PeriodFormatterBuilder().appendMillis().appendSuffix(" milliseconds ago").printZeroNever().toFormatter();
        }
        return formatter.print(period);
    }
}
