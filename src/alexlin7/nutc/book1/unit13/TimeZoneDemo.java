package alexlin7.nutc.book1.unit13;

import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        var japanTimeZone = TimeZone.getTimeZone("Asia/Tokyo");

        System.out.println(timeZone.getDisplayName());
        System.out.println("\t 時區ID: " + timeZone.getID());
        System.out.println("\t 日光節約時數: " + timeZone.getDSTSavings());
        System.out.println("\t 偏移豪秒數: " + timeZone.getRawOffset());

        System.out.println("以下為指定時區==========");
        System.out.println(japanTimeZone.getDisplayName());
        System.out.println("\t 時區ID: " + japanTimeZone.getID());
        System.out.println("\t 日光節約時數: " + japanTimeZone.getDSTSavings());
        System.out.println("\t 偏移豪秒數: " + japanTimeZone.getRawOffset());
    }
}
