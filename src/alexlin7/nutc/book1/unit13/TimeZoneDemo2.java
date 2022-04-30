package alexlin7.nutc.book1.unit13;

import java.util.TimeZone;
import java.util.Calendar;
import static java.lang.System.*;

public class TimeZoneDemo2 {
    public static void main(String[] args) {
        var japanTZ = TimeZone.getTimeZone("Asia/Tokyo");
        var calendar = Calendar.getInstance(japanTZ);
        showTime(calendar);

        var stockholmTZ = TimeZone.getTimeZone("Europe/Stockholm");
        calendar.setTimeZone(stockholmTZ);
        showTime(calendar);

    }

    static void showTime(Calendar calendar) {
        out.print(calendar.getTimeZone().getDisplayName());
        out.printf(" %d:%d%n",
                calendar.get(Calendar.HOUR),
                calendar.get(Calendar.MINUTE));
    }
}
