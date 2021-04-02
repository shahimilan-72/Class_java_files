package Day3;

public class OperatorDemo1 {
    public static void main(String args [])
    {
        //1. Arithmetic Operators ( + - ) low priority ( * % /) high pririty
        //for same level precedence go from left to right
        int a = 4 + 5 -3 * 2 + 4 / 2 - 7 % 3;
        //a = 4 + 5 -6 + 4 / 2 - 7 % 3;
        //a = 4 + 5- 6 + 2 - 7 % 3;
        //a = 4 + 5 - 6 + 2 - 2 - 1;
        //a = 9 - 5 + 2 + 2 - 1;
        //a = 4 + 2 -2 + 1;
        //a = 5 -2 + 1;
        //a = 3 + 1;
        //a = 4;
        System.out.println(a);
    }
}
