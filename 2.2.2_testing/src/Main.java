interface Drivable {
    void drive();
}

class Vehicle {
    String brand;
    void startEngine() {
        System.out.println("Engine started for " + brand );
    }
}

class Car extends Vehicle implements Drivable {
    String model;
    Car(String b, String m) { brand = b; model = m; }
    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");
        c.drive();
        c.startEngine();
    }
}
