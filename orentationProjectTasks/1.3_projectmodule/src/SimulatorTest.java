import java.util.List;
import java.util.ArrayList;


public class SimulatorTest {
    public static void main(String[] args) {
        List<Event> eventList = new ArrayList<>(); // List to holdaa eventtei
        Clock.getInstance().setTime(0);
        ArrivalProcess ap = new ArrivalProcess(EventType.ARRIVAL, 0.5); // aArrival processoida ratea
        ap.generateArrivals(eventList, 10);

        ServicePoint servicePoint = new ServicePoint();

        // Process events sequentially
        for (Event e : eventList) {
            Customer customer = new Customer(e.getTime());
            servicePoint.addCustomer(customer);
        }

        // Advance clock slightly
        Clock.getInstance().advanceTime(5);

        System.out.println("Service results:");
        servicePoint.clearCustomers(Clock.getInstance().getTime());
    }
}