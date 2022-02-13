package alexlin7.nutc.book1.unit9;

import java.util.*;

public class MapkeyValue {
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");

        //use lambda
        System.out.println("顯示key");
        map.keySet().forEach(System.out::println);
        System.out.println("顯示value");
        map.values().forEach(System.out::println);
    }
}
