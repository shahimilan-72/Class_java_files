package Day13;

public class AccessModifierDemo {

    String defaultVar = "this is default variable";
    public String publicVa = " this is public variable";
    private String privateVar = " this is private variable";
    protected String protectedVar = "this is protected variable";

   void defaultMethod(){
        System.out.println("This is default method");
    }
    public void publicMethod(){
        System.out.println("This is public method");
    }
    private void privateMethod(){
        System.out.println("This is private method");
    }
    protected void protectedMethod(){
        System.out.println("This is protected method");
    }
    AccessModifierDemo(){
        System.out.println("This is default constructor");
    }
    public AccessModifierDemo(int a){
        System.out.println("This is public constructor");
    }
     private AccessModifierDemo(int a, int b){
        System.out.println("This is private constructor");
    }
    protected AccessModifierDemo(String s){
        System.out.println("This is protected constructor");
    }

    public static void main (String [] args){
        AccessModifierDemo obj = new AccessModifierDemo(6,8);
        obj.defaultMethod();
        obj.privateMethod();
        obj.protectedMethod();
    }



}
