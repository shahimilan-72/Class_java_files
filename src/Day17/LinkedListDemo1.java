package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

    public static void main (String [] args)
        {
            List<Integer> al = new LinkedList<>();
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
            List<Integer> all = new LinkedList<>();
            System.out.println(all);
            //all.addAll(all);
            all.addAll(0,all);
            System.out.println(all);
            //   al.remove(all);
            all.retainAll(al);
            System.out.println(all);


        }
    }

    //difference between liked list and array list
//1. ArrayList internally uses a dynamic array while LinkedList internally
// uses a doubly linked list to store the elements.
//2. Manipulation with the array list is slow whereas manipulation with the
//linked list is fast
//3.Arraylist is better for storing and accessing whereas linked list is better
//manipulation