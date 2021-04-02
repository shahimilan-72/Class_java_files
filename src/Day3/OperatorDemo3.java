
package Day3;

public class OperatorDemo3 {

    public static void main (String [] args) {
        //3. Increment or Decrement Operator
        // ++ --
        //post pre
        //a++ a-- ++a --a
        int a = 5;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        int x = 7;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        int m = 2;
        int n = m--;
        System.out.println(m);
        System.out.println(n);

    }

}
