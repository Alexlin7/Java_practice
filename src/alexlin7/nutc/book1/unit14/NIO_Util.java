package alexlin7.nutc.book1.unit14;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.net.URL;

public class NIO_Util {
    public static void dump(ReadableByteChannel src,
                            WritableByteChannel dest) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try(src; dest) {
            while (src.read(buffer) != -1) {
                buffer.flip();
                dest.write(buffer);
                buffer.clear();
            }
        }
    }

    public static void main(String[] args) throws IOException{
        URL url = new URL("https://openhome.cc");
        var src = Channels.newChannel(url.openStream());
        var dest = new FileOutputStream("dest/index.html").getChannel();
        NIO_Util.dump(src, dest);
    }
}
