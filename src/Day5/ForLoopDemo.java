package Day5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------sum of the nth number----------");
        int sum = 0;
        int x = input.nextInt();
        for (int i =0; i<x; i++)
        {
            System.out.println(i);
            sum= sum +i;

        }
        System.out.println("The final sum is " +sum);
    }
}