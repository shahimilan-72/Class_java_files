package Day17;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

        public static void main(String[] argss) {
            Set<Integer> s = new HashSet<>();
            s.add(40);
            s.add(20);
            s.add(40);
            s.add(45);
            System.out.println(s);
            System.out.println("========================");

            List<Integer> l = new ArrayList<>();
            l.add(10);
            l.add(20);
            l.add(10);
            l.add(40);
            System.out.println(l);

        }

}
