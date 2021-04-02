package Day18;

import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FileDemo6 {
    public static void main(String[] args) {
        String readFilePath = "/Users/milanshahi/Desktop/milon/cat.docx";
        String writerFilePath = "/Users/milanshahi/Desktop/Tom.docx";


        try(
                FileReader fr = new FileReader(readFilePath);
                FileWriter fw = new FileWriter(writerFilePath);

        )
            {

                int len;
                while ((len = fr.read()) != -1) {

                    System.out.println(len);
                    fw.write(len);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
