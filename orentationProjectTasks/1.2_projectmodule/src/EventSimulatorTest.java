public class EventSimulatorTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // a) Generate some events
        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.EXIT));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(3.0, EventType.ARRIVAL));

        // b) Remove the next event
        Event next = eventList.getNextEvent();
        System.out.println("Processing event: " + next);

        // c) Print remaining events in order
        System.out.println("Remaining events:");
        System.out.println(eventList);
    }
}
