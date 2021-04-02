package Day18;
import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main (String [] args){
        String filepath = "/Users/milanshahi/Desktop/milan";
        File fil = new File(filepath);
        fil.mkdir();
        System.out.println("directory created");

    }
}
