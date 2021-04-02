package Day18;

import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FileDemo7 {
    public static void main(String[] args) {
        String readFilePath = "/Users/milanshahi/Desktop/milon/cat.docx";
        String writerFilePath = "/Users/milanshahi/Desktop/Tom.docx";


        try (
                FileReader fr = new FileReader(readFilePath);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(writerFilePath);
                BufferedWriter bw = new BufferedWriter(fw);

        ) {
            String len;
            while ((len = br.readLine()) != null) {

                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





