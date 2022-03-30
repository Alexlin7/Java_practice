package alexlin7.nutc.book1.unit11.executorSimple;

import java.net.URL;
import java.util.concurrent.*;
import java.io.*;

public class Pages {
    private final URL[] urls;
    private final String[] fileNames;
    private final Executor executor;

    public Pages(URL[] urls, String[] fileNames, Executor executor) {
        this.urls = urls;
        this.fileNames = fileNames;
        this.executor = executor;
    }

    public void download() {
        for(var i = 0; i < urls.length; i++) {
            var url = urls[i];
            var fileName = fileNames[i];
            executor.execute((() -> {
                try {
                    dump(url.openStream(), new FileOutputStream(fileName));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }));
        }
    }

    private void dump(InputStream src, FileOutputStream dest) throws IOException{
        try(src; dest) {
            byte[] data = new byte[1024];
            int length;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
