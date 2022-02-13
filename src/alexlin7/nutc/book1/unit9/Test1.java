package alexlin7.nutc.book1.unit9;

import java.util.*;

class IterableString<String> {
    private final List<String> myList;

    IterableString(String[] string){
        myList = Arrays.asList(string);
    }
    void foreach(){
        for(Object o : myList){
            System.out.println(o);
        }
    }
}



public class Test1 {
    public static void main(String[] args) {
        String[] a = {"justin", "alex", "Irena"};
        var test = new IterableString<>(a);
        test.foreach();
    }

}
