package Day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {

    public static void main(String [] argss){
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);


        }


}
//NOTE:  List Vs Set. 1) List is an ordered collection it maintains the insertion order, which means upon
// displaying the list content it will display the elements in the same order in which they got inserted
// into the list. Set is an unordered collection, it doesn't maintain any order.