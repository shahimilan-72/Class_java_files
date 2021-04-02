package Day6;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args)
    {
        int x = 10;

        for  (int i =0; i <x; i++)
        {

            if (i == 7)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("--------------");
    }
}