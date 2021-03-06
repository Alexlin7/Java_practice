package alexlin7.nutc.book1.unit11;

import java.net.URL;
import java.io.*;

public class Download2 {

    public static void main(String[] args) throws Exception{
        URL[] urls = {
                new URL("https://openhome.cc/Gossip/Encoding/"),
                new URL("https://openhome.cc/Gossip/Scala/"),
                new URL("https://openhome.cc/Gossip/JavaScript/"),
                new URL("https://openhome.cc/Gossip/Python/")
        };

        String[] fileNames = {
                "Encoding.html",
                "Scala.html",
                "JavaScript.html",
                "Python"
        };

        for(int i = 0; i < urls.length; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    dump(urls[index].openStream(),
                            new FileOutputStream("dest/" + fileNames[index]));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }).start();

        }
    }

    static void dump(InputStream src, OutputStream dest)
            throws IOException {

        try(src; dest) {
            byte[] data = new byte[1024];
            int length;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
