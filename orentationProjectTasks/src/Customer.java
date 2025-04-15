// Customer.java
public class Customer {
    private static int counter = 1; // Static counter to generate unique IDs
    private int id;
    private long startTime;
    private long endTime;

    // Constructor to initialize a new customer
    public Customer(long startTime, long endTime) {
        this.id = counter++; // Assign ID and increment counter
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
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

    // Method to calculate the time spent
    public long getTimeSpent() {
        return endTime - startTime;
    }
}
