package alexlin7.nutc.book1.unit13.jdk8;

import java.time.*;
import java.util.*;
import static java.lang.System.*;

public class HowOld2 {
    public static void main(String[] args) {
        out.print("請輸入出生年月日(yyyy-mm-dd) : ");
        var birth = LocalDate.parse(new Scanner(in).nextLine());
        var now = LocalDate.now();
        var period = Period.between(birth, now);
        out.printf("你活了 %d年 %d月 %d日%n",
                period.getYears(), period.getMonths(), period.getDays());
    }
}
