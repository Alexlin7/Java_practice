package alexlin7.nutc.book1.unit10;

import java.io.*;

public class Member {
    private final String NUMBER;
    private final String NAME;
    private final int AGE;

    public Member(String NUMBER, String NAME, int AGE) {
        this.NUMBER = NUMBER;
        this.NAME = NAME;
        this.AGE = AGE;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %d)", NUMBER, NAME, AGE);
    }

    public void save() throws IOException {
        try(var output = new DataOutputStream(
                new FileOutputStream("dest/" + NUMBER + ".txt"))){
            output.writeUTF(NUMBER);
            output.writeUTF(NAME);
            output.writeInt(AGE);
        }
    }

    public static Member load(String number) throws IOException{

        try(var input = new DataInputStream(
                new FileInputStream("dest/" + number + ".txt"))){

            return new Member(
                    input.readUTF(), input.readUTF(), input.readInt()
            );

        }
    }
}
