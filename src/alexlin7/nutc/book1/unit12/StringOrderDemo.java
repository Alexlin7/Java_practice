package alexlin7.nutc.book1.unit12;

import java.util.Arrays;

public class StringOrderDemo {
    public static void main(String[] args) {
        String[] names = {"Alexlin7", "WeiHo", "Irena"};
        Arrays.sort(names, StringOrder::byLength);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));
    }
}
