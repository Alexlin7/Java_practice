package alexlin7.nutc.book1.unit9;

import java.util.*;

public class Messages {
    public static void main(String[] args){
        var messages = new HashMap<String, String>();
        messages.put("Justin", "Hello!給Justin的訊息");
        messages.put("Monica", "給Monica的幹話");
        messages.put("Irena", "我愛Irena!!!!");

        var console = new Scanner(System.in);
        System.out.println("取得誰的訊息");
        String message = messages.get(console.nextLine());
        System.out.println(message);
        System.out.println(messages);
    }


}
