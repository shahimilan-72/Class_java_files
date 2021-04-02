package Day18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String [] args){
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        List<Integer> ll = Collections.unmodifiableList(l);
        System.out.println(l);
        //ll.add(6);  --> gives error since it cannot be modified
    }
}