package Day13;

public class AdditionDemo {
//method overloading
    public void sum(int a , int b){
        int r = a+b;
        System.out.println("1. sum is: " +r);

    }
    public void sum (int a, int b, int c){
        int r = a + b;
        System.out.println("2. sum is: " +r);
    }
    public void sum(int a, double b){
        double r = a + b;
        System.out.println("3. sum is: " +r);

    }
    public static void main (String [] args){
        //Compile time polymorphism(static binding)
        //which can be achieved by overloading of methods
        AdditionDemo obj = new AdditionDemo();
        obj.sum(5,6);
        obj.sum(7,5.5);
        obj.sum(2,3,4);

    }

}
