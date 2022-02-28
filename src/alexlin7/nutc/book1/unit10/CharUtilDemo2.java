package alexlin7.nutc.book1.unit10;

import java.io.*;

public class CharUtilDemo2 {
    public static void main(String[] args) throws IOException{
        var reader = new FileReader("dest/複製文.txt");
        var writer = new StringWriter();
        CharUtil2.dump(reader, writer);
        System.out.println(writer);
    }
}
