package Day5;

import java.util.Scanner;

public class SwitchCaseDemo3
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the choice: ");
        String choice = input.nextLine();

        switch (choice)
        {
            case "add":
                System.out.println("This is addition");
                break;
            case "sub":
                System.out.println("This is subtraction");
                break;
            case "div":
                System.out.println("This is division");
                break;
            case "mul":
                System.out.println("This is multiplication");
                break;
            default:
                System.out.println("Invalid input!!!!!!");
                break;
        }

    }
}


