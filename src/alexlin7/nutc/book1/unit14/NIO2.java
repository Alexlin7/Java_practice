package alexlin7.nutc.book1.unit14;

import java.io.IOException;
import java.nio.file.*;

public class NIO2 {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get(args[0]), new ConsoleFileVisitor());
    }
}
