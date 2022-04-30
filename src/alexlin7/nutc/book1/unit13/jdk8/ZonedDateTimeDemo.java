package alexlin7.nutc.book1.unit13.jdk8;

import java.time.*;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(0, 0, 0);
        LocalDate localDate = LocalDate.of(2001, 11, 7);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                localDate, localTime, ZoneId.of("Asia/Taipei")
        );

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.toEpochSecond());
        System.out.println(zonedDateTime.toInstant().toEpochMilli());
    }
}
