package Day8;

public class Employee
{
    //Encapsulation: Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the
    // data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other
    // classes, and can be accessed  only through the methods of their current class.
   public String employeeName;
   private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;

    }

    public String getEmployeeName ()
    {
        return employeeName;

    }

}
//Note:
// 1.Getters and setters are used to protect your data, particularly when creating classes.
// For each instance variable, a getter method returns its value while a setter method sets or
// updates its value. Given this, getters and setters are also known as accessors and mutators, respectively.

//2.The big difference is the constructor is called once and only once right at the start of the object's life.
// Setters may be called many times during the life of the object. The job of a constructor is to put a newly
// created object into a valid initial state before that object is used