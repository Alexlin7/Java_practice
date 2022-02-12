package alexlin7.nutc.unit9;

import java.util.*;

public class MapKeyValue3 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");

        //use lambda to for_loop
        map.forEach((key, value) -> System.out.printf("(鍵 %s, 值 %s)", key, value));
    }
}
