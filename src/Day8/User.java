package Day8;

public class User
{
    ///constructor overloading: more than one constructor in a class
    //How to do: number of arguments, sequence of arguments and type of arguments
    public User()
    {
        System.out.println("This is default(no-arg) constructor");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

    public User(String name, int age)
    {
        System.out.println("This is (augmented) constructor");
    }
    public static void main(String [] args)
    {
        User ob = new User();
        User obj = new User("Milan", 25);

    }
}
//Notes: If there is no constructor present then compiler gives default constructor. If argumented constructor is
//defined within the class then compiler won't give default constructor. In that case If default constructor is needed
// then we need to define by ourselves.

//If one or more constructor are made then it is called constructor overloading.

//Difference between constructor and method:
//The purpose of constructor is to initialize the object of a class while the purpose of a method is to perform a task
// by executing java code. Constructors cannot be abstract, final, static and synchronised while methods can be.
// Constructors do not have return types while methods do.