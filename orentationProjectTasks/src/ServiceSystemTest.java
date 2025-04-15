// ServiceSystemTest.java
import java.util.Scanner;

public class ServiceSystemTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Create the queue and service point
        Queue queue = new Queue();
        ServicePoint servicePoint = new ServicePoint(queue);

        // Generate customers
        System.out.print("Enter the number of customers: ");
        int numberOfCustomers = scanner.nextInt();
        CustomerGenerator.generateCustomers(servicePoint, numberOfCustomers);

        // Start serving customers
        System.out.println("\nServing customers...");
        servicePoint.serve();

        // Calculate the average service time
        calculateAverageServiceTime(servicePoint);
    }

    // Method to calculate average service time
    private static void calculateAverageServiceTime(ServicePoint servicePoint) {
        // For simplicity, we can assume that service time for each customer is being printed
        // In practice, you might store the service times in an array or list to calculate the average.
        // For this simple test, we are assuming we have gathered all necessary data
        System.out.println("\nAverage service time calculation is a placeholder here.");
    }
}
