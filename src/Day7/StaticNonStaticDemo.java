package Day7;

public class StaticNonStaticDemo
{
    //global variables can be accessed anywhere
    String nonStatic = "This is non-staticc method";
    String Static = "This is static method";

    public static void  staticMethod()
    {
        System.out.println("This is staticMethod");
        //local variable are created and accessed within method
        int a = 19;
        String name = "Milan";
    }

   public void nonStaticMethod()
   {
       System.out.println("This is non-static method");
   }

   public static void main(String [] args)
   {
       staticMethod();
       StaticNonStaticDemo ob = new  StaticNonStaticDemo();
       ob.nonStaticMethod();
   }
}
//for non-static method object creation is necessary to call the method
//for static method we can call method without creating object.