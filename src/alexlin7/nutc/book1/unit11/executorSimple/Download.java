package alexlin7.nutc.book1.unit11.executorSimple;

import java.net.URL;
import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Download {
    public static void main(String[] args) throws Exception {
        URL[] urls = {
                new URL("https://openhome.cc/Gossip/Encoding/"),
                new URL("https://openhome.cc/Gossip/Scala/"),
                new URL("https://openhome.cc/Gossip/JavaScript"),
                new URL("https://openhome.cc/Gossip/Python")
        };

        String[] fileNames = {
                "dest/Encoding.html",
                "dest/Scala.html",
                "dest/JavaScript.html",
                "dest/Python.html"
        };
        //new Pages(urls, fileNames, new DirectExecutor()).download();
        var executorService = Executors.newCachedThreadPool();
        new Pages(urls, fileNames, executorService).download();
        executorService.shutdown();

    }
}
