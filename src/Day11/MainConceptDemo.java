package Day11;

public class MainConceptDemo {
    public static void main (String [] args){
        printNames(new String [] {"ram", "10","11.32"});
    }

    public static void printNames(String [] names){
        for (String name : names){
            System.out.println(name);
        }
    }

}
