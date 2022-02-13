package alexlin7.nutc.book1.unit9;

import java.lang.StringBuilder;

public class Test2 {
    public static void main(String[] args) {
        String[] words = {"RADAR", "WARTER", "START", "MILK KLIM", "RESERVERED", "IWI"};

        for(var i : words) {
            StringBuilder o = new StringBuilder(i);
            if(i.equals(o.reverse().toString())) {
                System.out.println(i);
            }
        }

    }
}
