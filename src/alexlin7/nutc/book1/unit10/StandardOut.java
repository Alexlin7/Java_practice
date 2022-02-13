package alexlin7.nutc.book1.unit10;

import java.io.*;

public class StandardOut {
    public static void main(String[] args) throws IOException {
        try(var file = new PrintStream(
                new FileOutputStream(args[0]) )) {
            System.setOut(file);
            System.out.println("helloworld");
        }
    }
}
