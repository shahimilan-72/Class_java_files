package Day9;

public class ThisDemo4
{
    public ThisDemo4 getObject()
    {
        // ThisDemo4 ob = new ThisDemo4();
        //return ob;
        //return new ThisDemo64();
        return this;
    }
    public void greet()
    {
        System.out.println("Good Evening everyone");
    }
    public static void main(String [] args)
    {
        ThisDemo4 ob = new ThisDemo4();
        ThisDemo4 Obj = ob.getObject();
        Obj.greet();
    }
}
