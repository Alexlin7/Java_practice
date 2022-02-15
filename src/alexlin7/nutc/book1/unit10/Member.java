package alexlin7.nutc.book1.unit10;

import java.io.*;

public class Member {
    private final String number;
    private final String name;
    private final int age;

    public Member(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", number, name, age);
    }

    public void save() throws IOException {
        try(var output = new DataOutputStream(
                new FileOutputStream("resource/" + number + ".txt"))){
            output.writeUTF(number);
            output.writeUTF(name);
            output.writeInt(age);
        }
    }

    public static Member load(String number) throws IOException{

        try(var input = new DataInputStream(
                new FileInputStream("resource/" + number + ".txt"))){

            return new Member(
                    input.readUTF(), input.readUTF(), input.readInt()
            );

        }
    }
}
