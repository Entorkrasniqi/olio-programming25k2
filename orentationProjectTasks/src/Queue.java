// Queue.java
import java.util.LinkedList;

public class Queue {
    private LinkedList<Customer> queue = new LinkedList<>();

    // Method to add a customer to the queue
    public void addToQueue(Customer customer) {
        queue.addFirst(customer);  // Adds to the front of the queue (FIFO)
    }

    // Method to remove a customer from the queue
    public Customer removeFromQueue() {
        return queue.isEmpty() ? null : queue.removeLast();  // Removes from the back of the queue
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
