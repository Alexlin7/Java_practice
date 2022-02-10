package alexlin7.nutc.unit9;

import  java.util.*;

public class Messages3 {
    public static  void main(String[] args) {
        var messages = new TreeMap<String, String>(
                (s1, s2) -> -s1.compareTo(s2)
        );
        messages.put("Justin", "Hello!給Justin的訊息");
        messages.put("Monica", "給Monica的幹話");
        messages.put("Irena", "我愛Irena!!!!");
        System.out.println(messages);


    }
}
