class Customer {
    private static int counter = 0;
    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime) {
        this.id = ++counter;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}

public class OrientationTask1_4 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(System.currentTimeMillis());
        try {
            Thread.sleep(1000); // Simulate some time passing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        customer1.setEndTime(System.currentTimeMillis());

        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Time Spent: " + customer1.getTimeSpent() + " ms");

        Customer customer2 = new Customer(System.currentTimeMillis());
        customer2.setEndTime(customer2.getStartTime() + 500); // Simulating a quick transaction

        System.out.println("Customer ID: " + customer2.getId());
        System.out.println("Time Spent: " + customer2.getTimeSpent() + " ms");
    }
}
