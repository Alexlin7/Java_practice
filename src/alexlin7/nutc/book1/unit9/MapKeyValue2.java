package alexlin7.nutc.book1.unit9;

import java.util.Map;
import java.util.TreeMap;

public class MapKeyValue2 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        foreach(map.entrySet());
    }
    static void foreach(Iterable<Map.Entry<String, String>> iterable) {
        for(var entry : iterable) {
            System.out.printf("(鍵 %s, 值 %s)%n",
                    entry.getKey(), entry.getValue());
        }

    }
}
