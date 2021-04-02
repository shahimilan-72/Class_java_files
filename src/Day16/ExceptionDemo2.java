package Day16;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n1:");
        int a = input.nextInt();
        System.out.println("Enter number n2");
        int b = input.nextInt();
        try {
            System.out.println("try start");
             int div = divide(a,b);
            System.out.println("Division of a and b is "+div);
            System.out.println("try end");
         }
        catch(ArithmeticException x) {
            System.out.println("catch found");
        }

    }
    public static int divide(int a ,int b){
        return a/b;
    }
}
//try ==> {} block
//catch = {} block
//finally  => block
//throws => clause
