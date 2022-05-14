package alexlin7.nutc.book1.unit14;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import static java.lang.System.out;

public class Dir {
    public static void main(String[] args) throws IOException{
       try (var directoryStream =
               Files.newDirectoryStream(Paths.get(args[0]))) {

           var files = new ArrayList<String>();
           for (var path : directoryStream ) {
              if(Files.isDirectory(path)) {
                  out.printf("[%s]%n", path.getFileName());
              } else {
                  files.add(path.getFileName().toString());
              }
              files.forEach(out::println);
           }

       }
    }
}
