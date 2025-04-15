// ServicePoint.java
public class ServicePoint {
    private Queue queue;

    public ServicePoint(Queue queue) {
        this.queue = queue;
    }

    // Method to add a customer to the service queue
    public void addToQueue(Customer customer) {
        queue.addToQueue(customer);
    }

    // Method to remove a customer from the service queue
    public Customer removeFromQueue() {
        return queue.removeFromQueue();
    }

    // Method to simulate serving the customers in the queue
    public void serve() throws InterruptedException {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            long waitTime = System.nanoTime() - customer.getStartTime();
            long serviceTime = (long)(Math.random() * 5000);  // Simulating service time (random between 0 and 5 seconds)

            // Simulate the delay (service time)
            Thread.sleep(serviceTime / 1000000);  // Sleep time in milliseconds

            long responseTime = waitTime + serviceTime;
            System.out.println("Customer " + customer.getId() + " served. Response time: " + responseTime + " ns, Service time: " + serviceTime + " ns");
        }
    }
}
