package Day12;

public class Child extends Parent{

    String name =  "Child's name";
    public void sayHello(){

        System.out.println("Hello form child.....");
        System.out.println(name);
        System.out.println(super.name);

    }

}
//this --> on it's own class, non-static and constructor of class
//super--> only on child class, non-static and constructor of child class