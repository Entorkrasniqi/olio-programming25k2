public class SafeListTest {
    public static void main(String[] args) {
        SafeList<String> safeList = new SafeList<>();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                safeList.add("Hello " + i);
                safeList.size();
                safeList.remove("Hello " + (i - 1)); // Try removing previous item
                try {
                    Thread.sleep(50); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create multiple threads
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final size of list: " + safeList.size());
    }
}
