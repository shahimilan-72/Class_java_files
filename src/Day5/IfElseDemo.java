package Day5;
import java.util.Scanner;


public class IfElseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if (n<0)
        {
            System.out.println("The number is negative.");
        }
      else {
            System.out.println("The number is positive");
        }

    }
}