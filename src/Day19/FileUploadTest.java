package Day19;

public class FileUploadTest {
    public static void main(String[] args){
        FileUploader f1 = new FileUploader("file 1");
        FileUploader f2 = new FileUploader("file 2");
        FileUploader f3 = new FileUploader("file 3");

        f1.start();
        f2.start();
        f3.start();


    }

}
