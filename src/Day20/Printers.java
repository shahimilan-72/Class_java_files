package Day20;

import java.util.Arrays;

public class Printers {
    public static void print(String s){
        System.out.println(s);
    }

    public static void main (String [] args){
        Arrays.asList("a","b","c").stream().forEach(Printers::print);
    }
}
