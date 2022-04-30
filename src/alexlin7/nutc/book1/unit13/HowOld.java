package alexlin7.nutc.book1.unit13;

import java.util.*;
import java.text.*;

public class HowOld {
    public static void main(String[] args) throws Exception{
        System.out.print("請輸入出生年月日(yyyy-mm-dd) : ");
        var dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        var birthDate = dateFormat.parse(new Scanner(System.in).nextLine());
        var currentDate = new Date();
        var life = currentDate.getTime() - birthDate.getTime();
        System.out.println("你今年的歲數為:" + (life / (365 * 24 * 60 * 60 * 1000L)));
    }
}
