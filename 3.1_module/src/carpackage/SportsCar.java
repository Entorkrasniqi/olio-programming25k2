package carpackage;

public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName); // Calls Car constructor
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate(); // Increase speed by 10 (from Car class)
            super.accelerate(); // Increase speed by another 10 (twice the normal rate)
            useGasoline(5); // Higher fuel consumption
        } else {
            System.out.println("Out of fuel! Please fill the tank.");
        }
    }

    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2); // Decelerates faster than a normal car
    }

    private void useGasoline(double amount) {
        double currentGasoline = getGasolineLevel();
        if (currentGasoline >= amount) {
            System.out.println("Gasoline used: " + amount + " liters.");
        } else {
            System.out.println("Not enough fuel!");
        }
    }
}
