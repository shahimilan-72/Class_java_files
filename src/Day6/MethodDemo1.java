package Day6;

public class MethodDemo1 {

    public  void sayHello()
    {
        System.out.println("Hello! I am from Nepal");
    }

    public void displayInfo(String name, int age, double salary){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
    }

    public void information(int number, int height, int weight)
    {
        System.out.println("Phone number = " +number);
        System.out.println("Height = " +height);
        System.out.println("Weight = " +weight);

    }
    public static void main (String [] args)
    {
        //method calling
        MethodDemo1 obj = new MethodDemo1();
        obj.displayInfo("Milan", 25, 99999);
        obj.sayHello();

        int num = 7777777;
        int height = 5;
        int weight = 150;
        obj.information(num,height,weight);
    }
}