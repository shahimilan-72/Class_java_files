package Day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo5 {

    public static void main(String[] args) {
        String readFilePath = "/Users/milanshahi/Desktop/milon/cat.docx";
        String writeFilePath = "/Users/milanshahi/Desktop/Tom.docx";


        try(
                FileInputStream   fis = new FileInputStream(readFilePath);
                FileOutputStream fos = new FileOutputStream(writeFilePath);
                ) {

            int len;
            while ((len = fis.read()) != -1) {

                System.out.println(len);
                fos.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





