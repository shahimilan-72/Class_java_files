package Day5;

import java.util.Scanner;

public class NestedIfesleDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 90;
        int c = 900;
        if (a > b) {
            if (a > c) {
                System.out.println("A is greatest");
            } else {
                System.out.println(" C is greatest");
            }
        }
        else
            {
            if (b > c)
            {
                System.out.println("B is the greatest");
            } else
            {
                System.out.println("C is the greatest");
            }

        }
    }
}