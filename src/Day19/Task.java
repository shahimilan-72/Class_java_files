package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
    private String name;
    public Task(String name){
        this.name = name;
    }

    @Override
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss ");
        for (int i =1; i <=5; i++){
            if(i==0){
                System.out.println("Initialization time for: " + name + " " + sdf.format(new Date()));
            } else{
                System.out.println("running time for: " + name + " "+ sdf.format(new Date()));

            }
            System.out.println(name + "completed");
        }
    }
}
