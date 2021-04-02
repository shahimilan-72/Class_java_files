package Day20;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
  /*  public static void main(String [] args){
        List<Integer> l = Arrays.asList(2,7,3,8,4,6,5);
        l.stream().forEach(i -> System.out.println(i));
        List<Integer> ll = l.stream().map(i -> {
            i = i + 2;
            return i;
        }).collect(Collectors.toList());
        }
}
*/

    public static void main(String [] args){
        List<Integer> l = Arrays.asList(2,7,3,8,4,6,5);
        l.stream().forEach(i -> System.out.println(i));
        List<Integer> ll = l.stream().map(i->{

            i = i*2;
            return i;
        }).collect(Collectors.toList());
        System.out.println(ll);
        List<Integer> eventList = l.stream().filter(i -> 1% 2==0).collect(Collectors.toList());
        List<Integer> oddList = l.stream().filter(i -> 1% 2!=0).collect(Collectors.toList());
        System.out.println(eventList);
        System.out.println(oddList);
        int sum = l.stream().reduce(0,(a,b) ->a + b);
        System.out.println(sum);

       int min = l.stream().min((a,b) -> a.compareTo(b)).get();
       int max = l.stream().min((a,b) -> a.compareTo(b)).get();
       System.out.println(min);
       System.out.println(max);
        }
}
