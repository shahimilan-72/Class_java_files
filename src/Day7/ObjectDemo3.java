package Day7;

public class ObjectDemo3{
    int a;
    String x;
    public static void main(String[] args)
    {
        new ObjectDemo3();
        System.out.println(new ObjectDemo3().hashCode());

        ObjectDemo3 ob = new ObjectDemo3();
        System.out.println(ob.hashCode());

        ObjectDemo3 obj = new ObjectDemo3();
        System.out.println(obj.hashCode());

        System.out.println("day7.ObjectDemo3@" +Integer.toHexString(ob.hashCode()));
    }
}
//The Java.lang.Integer.toHexString() is a built-in function in Java which returns a string representation of the
// integer argument as an unsigned integer in base 16. The function accepts a single parameter as an argument in Integer.