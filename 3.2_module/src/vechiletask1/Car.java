package vechiletask1;

public class Car implements Vehicle {
    @Override
    public void start () {
        System.out.println("Car is starting! wroom, wrooooooom");
    }

    @Override
    public void stop () {
        System.out.println("Car is stopping!");
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: Bus\nFuel: Diesel\nCapacity: 40 passengers";
    }
}
