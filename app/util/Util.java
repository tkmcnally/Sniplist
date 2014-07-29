package util;

import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * Created by Thomas on 7/28/2014.
 */
public class Util {

    public static int isoToSeconds(String isoString) {

        PeriodFormatter format = ISOPeriodFormat.standard();
        Period start = format.parsePeriod(isoString);

        return start.toStandardSeconds().getSeconds();
    }

}
