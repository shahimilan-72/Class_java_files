package Day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo3 {

    public static void main(String[] argss) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);

        System.out.println("===============================");
        for (int i : s) {
            System.out.println(i);
        }
        System.out.println("==================================");
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=======================================");
        s.forEach(new Consumer<Integer>() {
            @Override
            public void accept (Integer a){
                System.out.println(a);
            }
        });

    }
}