package alexlin7.nutc.book1.unit13.jdk8;

import java.time.*;

public class MonthDemo {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.printf("original: %d\t value: %d\t %s%n",
                    month.ordinal(), month.getValue(), month);
        }
    }
}
