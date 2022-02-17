package alexlin7.nutc.book1.unit10;

import java.io.*;

public class CharUtilDemo {
    public static void main(String[] args) throws IOException{
        var reader = new FileReader("resource/複製文.txt");
        var writer = new StringWriter();
        CharUtil.dump(reader, writer);
        System.out.println(writer);
    }
}
