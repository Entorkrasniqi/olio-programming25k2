package carpackage;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    // Constructor
    public Car(String typeName) {
        this.speed = 0;
        this.gasolineLevel = 0;
        this.typeName = typeName;
    }

    // Accelerate method
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 2; // Reduce fuel when accelerating
        } else {
            speed = 0;
            System.out.println("Out of fuel! Please fill the tank.");
        }
    }

    // Decelerate method
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - amount);
        } else {
            speed = 0;
        }
    }

    // Getter for speed
    public double getSpeed() {
        return speed;
    }

    // Getter for typeName
    public String getTypeName() {
        return typeName;
    }

    // Fill tank method
    public void fillTank() {
        gasolineLevel = 100;
        System.out.println("Tank filled. Gasoline level: " + gasolineLevel);
    }

    // Getter for gasoline level
    public double getGasolineLevel() {
        return gasolineLevel;
    }
}
