package alexlin7.nutc.book1.unit13;

import java.util.*;
import static java.lang.System.*;
import static java.text.DateFormat.*;

public class DateFormatDemo {
    public static void main(String[] args) {
        var date = new Date();
        dateInstanceDemo(date);
        timeInstanceDemo(date);
        dateTimeInstanceDemo(date);
    }

    static void dateInstanceDemo(Date date) {
        out.println("getDateInstance() demo");
        out.printf("\tLONG: %s%n", getDateInstance(LONG).format(date));
        out.printf("\tSHORT: %s%n", getDateInstance(SHORT).format(date));
    }

    static void timeInstanceDemo(Date date) {
        out.println("getTimeInstance() demo");
        out.printf("\tLONG: %s%n", getTimeInstance(LONG).format(date));
        out.printf("\tMEDIUM: %s%n", getTimeInstance(MEDIUM).format(date));
        out.printf("\tSHORT: %s%n", getTimeInstance(SHORT).format(date));
    }

    static void dateTimeInstanceDemo(Date date) {
        out.println("getDateTImeInstance() demo");
        out.printf("\tLONG: %s%n",
                getDateTimeInstance(LONG, LONG).format(date));
        out.printf("\tMEDIUM: %s%n",
                getDateTimeInstance(SHORT, MEDIUM).format(date));
        out.printf("\tSHORT: %s%n",
                getDateTimeInstance(SHORT, SHORT).format(date));
    }
}
