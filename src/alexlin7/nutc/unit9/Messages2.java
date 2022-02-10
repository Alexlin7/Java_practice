package alexlin7.nutc.unit9;

import java.util.*;

public class Messages2 {
    public static void main(String[] args) {
        var messages = new TreeMap<String, String>();
       messages.put("Justin", "Hello!給Justin的訊息");
       messages.put("Monica", "給Monica的幹話");
        messages.put("Irena", "我愛Irena!!!!");

        System.out.println(messages);
    }
}
