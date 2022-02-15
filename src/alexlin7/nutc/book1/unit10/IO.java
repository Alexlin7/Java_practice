package alexlin7.nutc.book1.unit10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
    public static void dump(InputStream src, OutputStream dest)
            throws IOException {

        //InputStream and OutputStream extend java.lang.AutoCloseable,
        //so we can use try-with-resources .
        try(src; dest) {
            byte[] data = new byte[1024];
            int length;
            while((length = (src.read(data)) )!= -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
