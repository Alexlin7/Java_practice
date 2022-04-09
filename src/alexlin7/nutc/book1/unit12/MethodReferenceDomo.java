package alexlin7.nutc.book1.unit12;

import java.util.*;
import java.util.function.Function;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
}

public class MethodReferenceDomo {
    static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {
        var mapped = new ArrayList<R>();
        for (P p : list) {
            mapped.add(mapper.apply(p));
        }
        return mapped;
    }

    public static void main(String[] args) {
        var names = List.of(args);
        var persons = map(names, Person::new);
        persons.forEach(System.out::println);
    }
}
