package alexlin7.nutc.book1.unit14;

import java.io.IOException;
import java.nio.file.*;
import static java.lang.System.*;

public class LS2 {
    public static void main(String[] args) throws IOException {
        var syntax = args.length == 2 ? args[0] : "glob";
        var pattern = args.length == 2 ? args[1] : "*";
        out.println(syntax + ":" + pattern);

        var userPath = Paths.get(System.getProperty("user.dir"));
        var matcher = FileSystems.getDefault()
                .getPathMatcher(syntax + ":" + pattern);
        try(var directoryStream = Files.newDirectoryStream(userPath)) {
            directoryStream.forEach(path -> {
                var file = Paths.get(path.getFileName().toString());
                if (matcher.matches(file)) {
                    out.println(file.getFileName());
                }
            });
        }
    }
}
