package alexlin7.nutc.book1.unit14;

import java.nio.file.*;
import java.io.IOException;
import static java.lang.System.*;

public class LS {
    public static void main(String[] args) throws IOException {
        var glob = args.length == 0 ? "*" : args[0];
        var userPath = Paths.get(System.getProperty("user.dir"));
        try(var directoryStream = Files.newDirectoryStream(userPath, glob)) {
            directoryStream.forEach(path -> out.println(path.getFileName()));
        }
    }
}
