package Day10;

public class ArrayDemo12
{
    public static void main (String [] args)
    {
        int [] [] arr = new int [3][];

        arr[0] = new int [1];
        arr[1] = new int [2];
        arr[2] = new int [3];

        arr[0] [0] = 10;

        arr[1] [0] = 15;
        arr[1] [1] = 20;

        arr[2] [0] = 25;
        arr[2] [1] = 30;
        arr[2] [2] = 35;

        for (int[] ar: arr)
        {
            for(int a: ar)
            {
                System.out.print(a +"  ");
            }
            System.out.println();
        }


    }
}
//jacked array