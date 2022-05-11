package alexlin7.nutc.book1.unit14;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.*;
import java.text.DecimalFormat;

public class Disk {
    public static void main(String[] args) throws IOException{
        if (args.length == 0) {
            var fileSystem = FileSystems.getDefault();
            for(var fileStore : fileSystem.getFileStores()) {
                Disk.print(fileStore);
            }
        } else {
            for (var file : args) {
                var fileStore = Files.getFileStore(Paths.get(file));
                Disk.print(fileStore);
            }
        }
    }

    public static void print(FileStore store) throws IOException {
        var total = store.getTotalSpace();
        var used = total - store.getUnallocatedSpace();
        var usable = store.getUsableSpace();
        var fomatter =new DecimalFormat("#,###,###");
        out.println(store);
        out.printf("\t- 總容量\t%s\t位元組%n", fomatter.format(total));
        out.printf("\t- 可用空間\t%s\t位元組%n", fomatter.format(used));
        out.printf("\t- 已用空間\t%s\t位元組%n", fomatter.format(usable));
    }
}
