// CustomerGenerator.java
public class CustomerGenerator {
    public static void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {
        for (int i = 0; i < numberOfCustomers; i++) {
            long startTime = System.nanoTime();
            long endTime = startTime + (long)(Math.random() * 5000); // Random end time
            Customer customer = new Customer(startTime, endTime);
            servicePoint.addToQueue(customer);
        }
    }
}
