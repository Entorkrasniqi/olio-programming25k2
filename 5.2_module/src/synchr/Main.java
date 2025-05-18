package synchr;

public class Main extends Counter{
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // complete the code below
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        t1.start(); 
        t2.start();
        t1.join(); 
        t2.join();
        System.out.println("result: " + c.count);

    }
    
}