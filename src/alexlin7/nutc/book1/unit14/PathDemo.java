package alexlin7.nutc.book1.unit14;

import java.nio.file.*;
import static java.lang.System.*;

public class PathDemo {
    public static void main(String[] args) {
        var path = Paths.get(
                System.getProperty("user.home"),"Documents", "Downloads"
        );
        out.printf("toString: %s%n", path);
        out.printf("getFileName: %s%n", path.getFileName());
        out.printf("getName: %s%n", path.getName(0));
        out.printf("getNameCount: %s%n", path.getNameCount());
        out.printf("subPath(0, 2) %s%n", path.subpath(0, 2));
        out.printf("getParent: %s%n", path.getParent());
        out.printf("getRoot: %s%n", path.getRoot());

    }
}
