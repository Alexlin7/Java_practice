package alexlin7.nutc.book1.unit10;

import java.io.*;

public class Member2 {
    private final String number;
    private final String name;
    private final int age;

    public Member2(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", number, name, age);
    }

    public void save() throws IOException {
        try(var output = new ObjectOutputStream(
                new FileOutputStream("dest/" + number + ".txt"))){
            output.writeObject(this);
        }
    }

    public static Member2 load(String number)
            throws IOException, ClassNotFoundException{

        try(var input = new ObjectInputStream(
                new FileInputStream("dest/" + number + ".txt"))){

            return (Member2) input.readObject();

        }
    }
}
