package Day5;

import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------sum of the nth number----------");
        int sum = 0;
        int x = input.nextInt();
        int i = 0;

        while (i < x)
        {
            sum = sum + i;
            i++;
            System.out.println(i);

        }

        System.out.println("The final sum is " +sum);
    }
}
