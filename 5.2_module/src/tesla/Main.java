package tesla;

// Base class - DO NOT MODIFY
class Vehicle {
    protected String make;
    protected int year;
    
    // No constructor provided - you'll need to create it
    public Vehicle (String make, int year) {
        this.make = make;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Vehicle: " + make + " (" + year + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: 
        // 1. Add constructor to Vehicle class*
        // 2. Create a Car class that inherits from Vehicle*
        // 3. Car should have an additional 'model' attribute
        // 4. Override displayInfo() to show make, model and year
        
        // Your code goes here

        

        class Car extends Vehicle { //supclass extends vehicle
            protected String model; // class level declaration
            public Car (String make, String model, int year) { // construtor 
                super(make, year);
                this.make = make;
                this.year = year;
                this.model = model;
                
            }
            @Override
            public void displayInfo () {
            System.out.println("Car: " + make + " " + year + " " + model);
        }
        }
    
        
        // Don't change the code below
        Car car = new Car("Toyota", "Corolla", 2022);
        car.displayInfo();
        
        // Expected output:
        // Car: Toyota Corolla (2022)
    }
}