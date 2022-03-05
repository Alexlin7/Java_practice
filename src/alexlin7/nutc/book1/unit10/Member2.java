package alexlin7.nutc.book1.unit10;

import java.io.*;

public class Member2 {
    private final String NUMBER;
    private final String NAME;
    private final int AGE;

    public Member2(String number, String NAME, int AGE) {
        this.NUMBER = number;
        this.NAME = NAME;
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", NUMBER, NAME, AGE);
    }

    public void save() throws IOException {
        try(var output = new ObjectOutputStream(
                new FileOutputStream("dest/" + NUMBER + ".txt"))){
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
