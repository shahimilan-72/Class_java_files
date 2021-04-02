package Day5;

import java.util.Scanner;

public class SwitchCaseDemo2 {

    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the choice: ");
        char choice = input.next().charAt(0);

        switch (choice)
        {
            case '+':
                System.out.println("This is addition");
                break;  //if break is not mentioned then it keeps printing all the result after the condition is true
            case '-':
                System.out.println("This is subtraction");
                break;
            case '*':
                System.out.println("This is multiplication");
                break;
            case'/':
                System.out.println("This is division");
                break;

        }

    }
}


