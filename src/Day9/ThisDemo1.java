package Day9;

public class ThisDemo1
{
    //Shadowing: is the process of hiding instance variables by the local variables
    //inside non-static and constructor of a class

    //this : is the keyword and is an implicit reference variable and is available inside
    //nom-static method and constructor of a class.
    //we cannot change the value of 'this'

    //instance variables
    int a =5;

    public void print()
    {
        System.out.println(a);
        int a =6;
        System.out.println(a);
        int sum = 0;
        sum = this.a + a; // a + a = 12 >>>>>> to refer previous 'a' use this.a
        System.out.println(sum);
    }
    public static void main(String [] args)
    {
        ThisDemo1 ob = new ThisDemo1();
        System.out.println("obj us "  +ob);

        ob.print();
    }
}
//Note: The this keyword refers to the current object in a method or constructor. The most common use of the this
// keyword is to eliminate the confusion between class attributes and parameters with the same name
// (because a class attribute is shadowed by a method or constructor parameter).