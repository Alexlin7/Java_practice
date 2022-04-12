package alexlin7.nutc.book1.unit12;

import java.util.List;
import static java.lang.System.out;

public class DemoStreamControl {
    public static void main(String[] args) {
        var players = List.of(
                new Player("Alexlin7", 12),
                new Player("Monica", 22),
                new Player("Ireina", 18)
        );
        players.stream()
                .filter(player -> player.getAge() > 15)
                .map(Player::getName)
                .map(String::toUpperCase)
                .toList()
                .forEach(out::println);
    }
}

class Player {
    private final String name;
    private final Integer age;

    public Player(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
