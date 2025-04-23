import java.util.*;

public class ServicePoint {
    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer c) {
        queue.add(c);
    }
// Method procesoida the customer
    public void clearCustomers(double currentTime) {
        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            double timeInSystem = currentTime - c.getArrivalTime();
            System.out.printf("Customer arrived at %.2f, left at %.2f, time in system: %.2f\n",
                    c.getArrivalTime(), currentTime, timeInSystem);
        }
    }
}
