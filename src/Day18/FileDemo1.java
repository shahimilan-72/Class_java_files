package Day18;
import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main (String [] args){
        String filepath = "/Users/milanshahi/Desktop/milan.pdf";
        File fil = new File(filepath);
      try {
          if (fil.createNewFile()) {
              System.out.println("file created...");
          } else {
              System.out.println("file already exists");
          }
      } catch (IOException e){
          e.printStackTrace();
      }

    }
}
