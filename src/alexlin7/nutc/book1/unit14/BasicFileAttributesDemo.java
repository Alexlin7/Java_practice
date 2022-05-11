package alexlin7.nutc.book1.unit14;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import static java.lang.System.*;

public class BasicFileAttributesDemo {
    public static void main(String[] args) throws IOException{
        var file = Paths.get("C://windows");
        BasicFileAttributes attributes =
                Files.readAttributes(file, BasicFileAttributes.class);
        out.printf("creationTime: %s%n", attributes.creationTime());
        out.printf("lastAccessTime: %s%n", attributes.lastAccessTime());
        out.printf("lastModifiedTime: %s%n", attributes.lastModifiedTime());
        out.printf("isDirectory: %b%n", attributes.isDirectory());
        out.printf("isOther: %b%n", attributes.isOther());
        out.printf("isRegularFile: %b%n", attributes.isRegularFile());
        out.printf("isSymbolicLink: %b%n", attributes.isSymbolicLink());
        out.printf("size: %d%n", attributes.size());

    }
}
