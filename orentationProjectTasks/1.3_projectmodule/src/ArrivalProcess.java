import java.util.*;

public class ArrivalProcess {
    private final ExponentialDistribution generator;
    private final EventType eventType;
// sd
    public ArrivalProcess(EventType eventType, double rate) {
        this.generator = new ExponentialDistribution(rate);
        this.eventType = eventType;
    }

    public void generateArrivals(List<Event> eventList, int numberOfArrivals) {
        double currentTime = Clock.getInstance().getTime();
        for (int i = 0; i < numberOfArrivals; i++) {
            double interval = generator.nextInterval();
            currentTime += interval;
            Clock.getInstance().setTime(currentTime); // update clock
            eventList.add(new Event(eventType, currentTime));
        }
    }
}
