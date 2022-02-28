package alexlin7.nutc.book1.unit10;

import java.io.*;

public class Test1 {
    public static void dump(InputStream src, OutputStream dest)
                        throws IOException{
        try(src; dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }

        } catch (Exception e) {
            DataOutputStream log = new DataOutputStream(
                    new FileOutputStream("dest/exception.log"));
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);

            e.printStackTrace(pw);
            log.writeUTF(sw.toString());

            log.close();
            pw.close();
            sw.close();

            throw e;
        }
    }
}
