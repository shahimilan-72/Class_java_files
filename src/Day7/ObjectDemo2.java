package Day7;

public class ObjectDemo2 {
    int a;
    String x;

    public static void main(String[] args)
    {


        new ObjectDemo2();
        System.out.println(new ObjectDemo2());
        System.out.println(new ObjectDemo2().a);
        System.out.println(new ObjectDemo2().x);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

        ObjectDemo2 ob;
        ob = new ObjectDemo2();
        System.out.println(ob);
        System.out.println((ob).a);
        System.out.println((ob).x);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

        ObjectDemo2 obj = new ObjectDemo2();
        System.out.println(obj);
        System.out.println((obj).a);
        System.out.println((obj).a);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}