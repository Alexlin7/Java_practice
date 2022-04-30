package alexlin7.nutc.book1.unit13;

import java.util.Calendar;

public class CalenderUtil {
    public static void main(String[] args) {
        var birth = Calendar.getInstance();
        birth.set(2001, Calendar.NOVEMBER, 7);
        var now = Calendar.getInstance();
        System.out.printf("歲數: %d%n", yearsBetween(birth, now));
        System.out.printf("天數 %d%n", daysBetween(birth, now));
    }

    static long yearsBetween(Calendar begin, Calendar end) {
        var calendar = (Calendar) begin.clone();
        var year = 0;
        while (calendar.before(end)) {
            calendar.add(Calendar.YEAR, 1);
            year++;
        }
        return year - 1;
    }

    public static long daysBetween(Calendar begin, Calendar end) {
        var calendar = (Calendar) begin.clone();
        var days = 0;
        while (calendar.before(end)) {
            calendar.add(Calendar.DATE, 1);
            days++;
        }
        return days - 1;
    }
}
