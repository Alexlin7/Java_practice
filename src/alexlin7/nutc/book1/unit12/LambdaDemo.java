package alexlin7.nutc.book1.unit12;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names,
                Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(names));
/*
        由於是比較長度 所以可以直接參考Comparator下的comparingInt
        Arrays.sort(names,
                (name1, name2) -> name1.length() - name2.length());
        System.out.println(Arrays.toString(names));
*/
    }
}
