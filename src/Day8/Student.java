package Day8;

public class Student
{
    //non-static variable, instance variable, member's data, data, property, attributes
    String name,n;
    int age,r;


    public Student (String n, int r)
    {
       name = n;
       age = r;
        System.out.println("Constructor called");
    }

    public void displayInfo()
    {
        System.out.println("Name:  " +n);
        System.out.println("Age:  " +r);
    }


    public static void main (String [] args)
    {
        Student student = new Student("Gopal", 25);
        student.displayInfo();


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        student.n = "Ramesh";
        student.r = 21;
        System.out.println("Name:  " +student.n);
        System.out.println("Age:   " +student.r);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

    }

}
//constructor is a special function which has following features;
//1. It's name is same as class name.
//2. It has no return type.
//3. We can not use void keyword.
//4. It can have any access modifier.
//5. It runs only once for each object.
//6.It is mainly used to initialize the member data.

//class: is a specification/template/model/prototype
//object: is an instance of a class which has properties and behaviour