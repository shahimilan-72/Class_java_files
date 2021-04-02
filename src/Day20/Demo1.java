package Day20;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String [] args){
        new Thread(() ->{ //lambda expression
            System.out.println("helllo from thread");
            System.out.println("hihihihihi");

        }).start();
        List<Integer> l = Arrays.asList(2,10,25,4);
        l.forEach(i -> System.out.println(i));// for loop using lambda expression
        System.out.println(l);
        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 >o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        System.out.println(l);


        }
}
