package Day10;

public class ArrayDemo11
{
    public static void main(String[] args)
    {

        String[][] names = new String[][]{{"Ram", "Shyam", "Hari"}, {"Mohan", "Gopal", "Baje"}, {"Krishna", "Gita", "Rita"}};

        for (String[] name : names) {
           for (String n : name) {
               System.out.print(n + " ");
           }
            System.out.println();

        }

    }
}
//advanced for each loop
