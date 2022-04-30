package alexlin7.nutc.book1.unit13.test;

import java.util.*;
import java.text.*;
import static java.lang.System.*;

public class Demo1 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd EE");
        out.println(simpleDateFormat.format(new Date()));

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        out.println();
        out.println("週日\t周一\t周二\t周三\t周四\t周五\t周六");

        for(int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            out.print("\t ");
        }

        int count = 0;
        do {
            out.print(calendar.get(Calendar.DATE) + " \t");
            if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                out.println();
            }
            calendar.add(Calendar.DATE, 1);

            if(calendar.get(Calendar.DATE) == 1 && count == 0) {
                count++;
            }
        }while(count == 0);
    }
}
