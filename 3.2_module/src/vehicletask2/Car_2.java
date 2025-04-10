package vehicletask2;

public class Car_2 extends AbstractVehicle{
    public Car_2 () {
        super ("Car", "Petrol", "Red");
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color;
    }

}
