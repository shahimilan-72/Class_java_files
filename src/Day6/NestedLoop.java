package Day6;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            int j;
            for (j = 1; i <= 3; j++) {
                System.out.println(i + " " + j);
                break;
            }
            System.out.println();

        }
    }
}