package carpackage;

public class SportsCarMain {
    public static void main(String[] args) {
        SportsCar ferrari = new SportsCar("Ferrari");
        ferrari.fillTank(); // Fill the tank before driving

        System.out.println("Gasoline level: " + ferrari.getGasolineLevel());
        ferrari.accelerate(); // Should accelerate faster than normal cars
        System.out.println("Current speed: " + ferrari.getSpeed());

        ferrari.decelerate(5);
        System.out.println("Speed after deceleration: " + ferrari.getSpeed());
    }
}
