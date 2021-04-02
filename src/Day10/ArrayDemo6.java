package Day10;

public class ArrayDemo6
{
    public static void main (String [] args) {
        final int Rows = 3;
        final int Column = 3;

        int[][] arr = new int[Rows][Column];
        arr[0][0] = 5;
        arr[0][1] = 10;
        arr[0][2] = 15;
        arr[1][0] = 20;
        arr[1][1] = 25;
        arr[1][2] = 30;
        arr[2][0] = 35;
        arr[2][1] = 40;
        arr[2][2] = 45;


        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Column; j++)
            {
                System.out.print(arr[i][j]+ "  ");

            }System.out.println();
        }

    }
}
