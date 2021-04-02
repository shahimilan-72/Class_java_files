package Day17;

import java.util.*;

public class SetDemo4 {
    public static void main(String [] args)
    {
        Set<Integer> hs = new HashSet<>(); //removes the double content and print in random order
        hs.add(40);
        hs.add(20);
        hs.add(35);
        hs.add(20);
        System.out.println("Hash set is: " +hs);
        Set<Integer> lhs = new LinkedHashSet<>(); //removes the double and print in the serial order
        lhs.add(40);
        lhs.add(20);
        lhs.add(35);
        lhs.add(20);
        System.out.println("linked has set is: " + lhs); //removes te double and prints in the ascending order
        Set<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(20);
        ts.add(35);
        ts.add(20);
        System.out.println("linked has set is: " + ts);


    }
}
