package Day10;
import java.util.Scanner;

public class ArrayDemo3
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many values you want to put in?");
        int num = input.nextInt();
        int [] arr = new int[num];

        for(int i =0; i<num; i++)
        {
            System.out.println("Give the individual values: ");
            arr[i] = input.nextInt();

        }
        for(int i =0; i<num; i++) {
            System.out.println(arr[i]);
        }
    }
}
