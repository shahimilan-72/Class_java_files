package Day19;

import java.util.Random;
import java.util.concurrent.*;

public class Task2 implements Callable {
    private String name;

    public Task2(String name){
        this.name = name;
    }
    
    @Override
    public Integer call() throws Exception{
        Random random = new Random() ;
       Integer randomNumber = random.nextInt();
       return randomNumber;
    }
    public static void main(String [] args) throws ExecutionException, InterruptedException {

        ExecutorService executors = Executors.newSingleThreadExecutor();
       Future<Integer> future;
        future = executors.submit(new Task2("task 1"));
        Integer n = future.get();
        System.out.println(n);
        executors.shutdown();
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
    }
}
