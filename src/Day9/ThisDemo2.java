package Day9;

public class ThisDemo2
{
    String name;
    int age;

    public ThisDemo2(String name, int age)
    {
        this.name = name;
       this.age = age;
    }

    public  void displayInfo()
    {
        System.out.println("Name is:"  +name);
        System.out.println("Age is: " +age);

    }
    public static void main (String [] args)
    {
       ThisDemo2 obj  = new ThisDemo2("Milan", 26);
       obj.displayInfo();

    }
}
