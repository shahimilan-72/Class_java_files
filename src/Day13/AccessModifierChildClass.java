package Day13;

public class AccessModifierChildClass extends AccessModifierDemo {

    public static void main (String [] args){
        AccessModifierDemo ob = new AccessModifierDemo(5);
        ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod();
        ob.protectedMethod();
    }
}
