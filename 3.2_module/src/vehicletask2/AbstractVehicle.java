package vehicletask2;

public abstract class AbstractVehicle implements Vehicle_2 {
    protected String type;
    protected String fuel;
    protected String color;

    public AbstractVehicle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println(" is starting...");
    }

    @Override
    public void stop() {
        System.out.println(" is stopping");
    }

    @Override
    public abstract String getInfo();
}