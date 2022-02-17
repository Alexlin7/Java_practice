package alexlin7.nutc.book1.unit10;

import java.io.*;

public class CharUtil {
    public static void dump(Reader src, Writer dest) throws IOException{
        // Reader class and Writer class are implementing from AutoCloseable
        try(src; dest) {
            var data = new char[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
