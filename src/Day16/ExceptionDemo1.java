package Day16;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        int r = a / b;
        System.out.println(r);
        String s1 = null;
        s1.toCharArray(); //null-point exception

        String s2 = "123";
        int i = Integer.parseInt(s2);
        System.out.println(i); //number format exception

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:  ");
        int n = input.nextInt();
        System.out.println(n);//number mismatched exception

        int[] ar = new int[123];
        ar[2] = 10;


    }

}