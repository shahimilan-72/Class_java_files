package Day12;

public class SuperTest {

    public static void main (String [] args)
    {
        Super obj = new Sub();//implicit type casting
        obj.sayHello();

        //explicit type casting
        Super ob = new Super();
        Sub sub = (Sub) ob;
    }
}
