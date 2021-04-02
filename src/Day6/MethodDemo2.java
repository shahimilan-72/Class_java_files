package Day6;


public class MethodDemo2 {

    public static String greeting()
    {
        String g = "Good Afternoon sir";
        return g;
    }

    public static int findmax(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
            System.out.println("a is the maximum value");
        } else {
            max = b;
            System.out.println("b is the maximum value");
        }
        return max;
    }

    public static void main(String[] args)
    {
       String x =  greeting();
        System.out.println(x);
        findmax(6,10);

    }
}