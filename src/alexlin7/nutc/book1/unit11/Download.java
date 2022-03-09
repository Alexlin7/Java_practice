package alexlin7.nutc.book1.unit11;

import java.net.URL;
import java.io.*;

public class Download {

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
            dump(urls[i].openStream(), new FileOutputStream("dest/" + fileNames[i]));
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
