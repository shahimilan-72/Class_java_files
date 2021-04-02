package Day3;

import java.sql.SQLOutput;

public class OperatorDemo6 {

    public static void main(String[] args) {
        //6. Conditional (Ternary) Operator
        // ?:
        int a = 5;
        int b = 6;
        int c = 8;

        int Max = (a > (b > c ? b : c) ? a : (b > c ? b : c));
        System.out.println(Max);

        if (a > b) {
            System.out.println("a is greater than b");

        } else {
            System.out.println("b is greater than a");

        }
        System.out.println("---------------");
        String s = (a > b) ? "a is greater than b" : "b is greater than a";
        System.out.println(s);
        boolean r = (a > b) ? true : false;
        System.out.println(r);


    }

}
