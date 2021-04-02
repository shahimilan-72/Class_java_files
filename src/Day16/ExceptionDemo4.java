package Day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int [] arr = new int[2];

        try {
            System.out.println("try start");
            System.out.println("Enter number n1:");
            int a = input.nextInt();
            System.out.println("Enter number n2");
            int b = input.nextInt();
            arr [2] = divide(a,b);
            System.out.println("Division of a and b is "+arr[2]);
            System.out.println("try end");
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);

        }
        catch (InputMismatchException ie) {  //multi-level catch
            System.out.println(ie);
        }
        catch (Exception e){
            System.out.println(e);
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

