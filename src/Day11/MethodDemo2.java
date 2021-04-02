package Day11;

import java.util.Scanner;

public class MethodDemo2 {
    public void printElementOfAnArray(int ... arr) {
        for (int a:arr){
            System.out.println(a);

        }
    }
    public static void main (String [] args){ // static void main (String args []) { --->can be written in this format as well
        int [] arr = {1,2,3,4,5};
       MethodDemo2 obj = new MethodDemo2();
       obj.printElementOfAnArray(arr);
       obj.printElementOfAnArray(new int [] {6,7,8,9});
       obj.printElementOfAnArray(10,11,12,13);

    }

}

