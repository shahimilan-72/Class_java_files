package Day19;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TaskTest {
    public static void main(String [] args){
        ExecutorService executors = Executors.newFixedThreadPool(4);
        executors.execute(new Task ("Task 1"));
        executors.execute(new Task ("Task 2"));
        executors.execute(new Task ("Task 3"));
        executors.execute(new Task ("Task 4"));
        executors.execute(new Task ("Task 5"));
        executors.shutdown();

    }
}

