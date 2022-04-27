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
        由於是比較長度 所以可以引入Comparator下的comparingInt 然後丟String的參考方法
        Arrays.sort(names,
                (name1, name2) -> name1.length() - name2.length());
        System.out.println(Arrays.toString(names));
*/
    }
}
