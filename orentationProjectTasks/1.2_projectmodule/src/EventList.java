import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> queue;

    public EventList() {
        queue = new PriorityQueue<>();
    }

    public void addEvent(Event e) {
        queue.add(e);
    }

    public Event getNextEvent() {
        return queue.poll(); // Retrieves and removes the head
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Return a string representation sorted by time
    @Override
    public String toString() {
        PriorityQueue<Event> copy = new PriorityQueue<>(queue);
        StringBuilder sb = new StringBuilder();
        while (!copy.isEmpty()) {
            sb.append(copy.poll()).append("\n");
        }
        return sb.toString();
    }
}
