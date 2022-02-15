package alexlin7.nutc.book1.unit10;

import java.io.*;

public class BufferedIO {
    public static void dump(InputStream src, OutputStream dest)
                                throws IOException{

        try (var input = new BufferedInputStream((src))) {
            var output = new BufferedOutputStream(dest);
            byte[] data = new byte[1024];
            int length;
            while((length = input.read(data) )!= -1) {
                output.write(data, 0, length);
            }
        }
    }
}
