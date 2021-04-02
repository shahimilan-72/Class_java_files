package Day19;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the thread....");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the thread....");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the thread....");
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the thread....");
            }
        });
        t1.start();
        t2.start();
        t3.start();

    }

}