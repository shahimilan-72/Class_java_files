package Day13;

public class other {
    public static void main (String [] args){
        AccessModifierDemo ob = new AccessModifierDemo(5);
        ob.defaultMethod();
        ob.publicMethod();
        //ob.privateMethod();
        ob.protectedMethod();
    }
}

//for same package public,default,protected are accessed within;
//same class,sub-class and non-sub class