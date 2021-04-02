package Day18;
import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class FileDemo3 {
    public static void main (String [] args){
        String filepath = "/Users/milanshahi/Desktop/milan.pdf";
        File fil = new File(filepath);
        System.out.println(fil.getAbsolutePath());
        System.out.println(fil.getName());
        System.out.println(fil.isFile());
        System.out.println(fil.canExecute());
        System.out.println(fil.canRead());
        System.out.println(fil.canWrite());
        System.out.println(fil.exists());
        System.out.println(fil.isDirectory());
        fil.setWritable(false); //cannot make changes
        System.out.println(LocalDateTime.now());
        System.out.println(fil.lastModified());
        System.out.println(fil.isHidden());
        System.out.println(fil.canWrite());
        System.out.println(LocalDateTime.ofInstant(Instant.EPOCH.plusMillis(fil.lastModified()), TimeZone.getDefault().toZoneId() ));
        filepath = "/Users/milanshahi/Desktop/milan.pdf";
        File f = new File (filepath);
        filepath = "/Users/milanshahi/Desktop/milan.pdf";
        File file  = new File(filepath);
        file.renameTo(f);
    }
}
