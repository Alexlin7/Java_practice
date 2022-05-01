package alexlin7.nutc.book1.unit13.test;

import static java.lang.System.*;
import java.time.chrono.MinguoDate;
import static java.time.format.DateTimeFormatter.ofPattern;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Demo2 {
    public static void main(String[] args) {
        MinguoDate minguoDate = MinguoDate.now();
        myCalendar(minguoDate);
    }

    static void myCalendar(MinguoDate minguoDate) {
        out.printf("%n%s%n%n",
                minguoDate.format(ofPattern("民國 yyy 年 MM 月 dd 日 EE")));
        out.println("\n週日\t周一\t周二\t周三\t周四\t周五\t周六");
        var dayOfMonth = minguoDate.get(ChronoField.DAY_OF_MONTH);
        var dayOfWeek = minguoDate.plus(
                -dayOfMonth + 1, ChronoUnit.DAYS).get(ChronoField.DAY_OF_WEEK);

        for(int i = 1; i < minguoDate.get(ChronoField.DAY_OF_WEEK); i++) {
            if (minguoDate.get(ChronoField.DAY_OF_WEEK) == 7) break;
            out.print("\t");
        }

        for(var i = 1; i <= minguoDate.lengthOfMonth(); i++, dayOfWeek++) {
            out.print(i + "\t");
            if((dayOfWeek % 7) == 0) out.println();
        }
    }
}
