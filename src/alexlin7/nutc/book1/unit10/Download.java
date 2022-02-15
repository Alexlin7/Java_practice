package alexlin7.nutc.book1.unit10;

import java.io.*;
import java.net.URL;

public class Download {
    public static void main(String[] args) throws IOException {
        URL url = new URL(args[0]);
        var src = url.openStream();
        var dest = new FileOutputStream(args[1]);
        //IO.dump(src, dest);
        BufferedIO.dump(src, dest);
    }
}
