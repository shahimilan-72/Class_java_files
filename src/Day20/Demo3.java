package Day20;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Demo3 {
    public static void main(String[] args) {
      List<Integer> l = Arrays.asList(2,10,4,2);
      l.forEach(System.out::println); //method reference

    }
}