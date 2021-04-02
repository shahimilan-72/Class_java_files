package Day5;

import java.util.Scanner;

public class WhileDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("Enter the user name: ");
            String name = input.nextLine();
            System.out.println("The name of the user is " +name);

            if(name.equals("Milan"))
            {
                flag = false;

            }
        }
        System.out.println("----------");
    }
}