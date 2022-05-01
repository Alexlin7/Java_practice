package alexlin7.nutc.book1.unit13.test;

import java.util.*;
import java.text.*;
import static java.util.Calendar.*;
import static java.lang.System.*;

public class Demo1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd EE");
        out.println(simpleDateFormat.format(new Date()));
        myCalendar();
    }

    static void myCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(YEAR),calendar.get(MONTH), 1);
        int count = 0;

        out.println();
        out.println("週日\t周一\t周二\t周三\t周四\t周五\t周六");
        for(int i = 1; i < calendar.get(DAY_OF_WEEK); i++) {
            out.print("\t ");
        }
        do {
            out.print(calendar.get(DATE) + " \t");
            if(calendar.get(DAY_OF_WEEK) == SATURDAY) {
                out.println();
            }
            calendar.add(DATE, 1);
            if(calendar.get(DATE) == 1 && count == 0) {
                count++;
            }
        }while(count == 0);
    }

}
