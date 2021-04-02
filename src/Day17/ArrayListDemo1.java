package Day17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

    public static void main (String [] args)
    {
       List<Integer> al = new ArrayList<>();
       al.add(10);
       al.add(20);
       al.add(30);
        System.out.println(al);
        al.add(1,15);
        System.out.println(al);
        al.set(2,25);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        al.remove(3);
        System.out.println(al);
        System.out.println(al.indexOf(25));
        //all clear
        System.out.println(al.contains(25));
        System.out.println(al);
        System.out.println(al.isEmpty());

        System.out.println("==================");
        List<Integer> all = new ArrayList<>();
        System.out.println(all);
        //all.addAll(all);
        all.addAll(0,all);
        System.out.println(all);
     //   al.remove(all);
        all.retainAll(al);
        System.out.println(all);



    }
}
