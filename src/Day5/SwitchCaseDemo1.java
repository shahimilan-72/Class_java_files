package Day5;
import java.util.Scanner;


public class SwitchCaseDemo1
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the choice: ");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Excellent");
                break;  //if break is not mentioned then it keeps printing all the result after the condition is true
            case 2:
                System.out.println("Very good");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Satisfactory");
                break;
            case 5:
                System.out.println("not good");
                break;
        }

    }
}
