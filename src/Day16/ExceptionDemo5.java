package Day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int [] arr = new int[2];

        try {
            System.out.println("try start");
            System.out.println("Enter number n1:");
            int a = input.nextInt();
            System.out.println("Enter number n2");
            int b = input.nextInt();
            int div = divide(a,b);
            System.out.println("Division of a and b is "+div);
            System.out.println("try end");
        }
        catch(ArithmeticException  | InputMismatchException ae) {
            System.out.println(ae);

        }

        finally { //always run--> resource close,shutdown,release
            System.out.println("inside finally");
            input.close();//best practise to mention below
        }
        System.out.println("exit");

    }
    public static int divide(int a ,int b){
        return a/b;
    }
}
