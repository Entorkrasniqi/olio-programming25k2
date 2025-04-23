public class Event {
    private final EventType type;
    private final double time;
// Private final asiakas
    public Event(EventType type, double time) {
        this.type = type;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Event{" + "type=" + type + ", time=" + time + '}';
    }
}
