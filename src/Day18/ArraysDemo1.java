package Day18;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo1 {
    public static void main (String [] args){
        int [] arr = {19,15,20,25,30};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> l = Arrays.asList(30,40,12,31);
        System.out.println(l);

        for(int a: arr){
            System.out.println(a);
        }
    }
}
