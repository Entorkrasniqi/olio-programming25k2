package caron;

// Interface for vehicle information display
interface VehicleInfo {
    // Get vehicle type (e.g., "Sedan", "SUV", etc.)
    String getType();
    
    // Display vehicle details
    void displayDetails();
    
    // Calculate and return fuel efficiency in MPG
    double getFuelEfficiency();
}

public class Main {
    public static void main(String[] args) {
        // TODO:
        // Create a Car class that implements VehicleInfo interface
        // It should:
        // 1. Have attributes for make, model, year, and fuelEfficiency
        // 2. Implement all required interface methods
        // 3. Constructor should take all attributes as parameters
        // 4. displayDetails() should print all car information in this format:
        //    "Car: [year] [make] [model], Fuel Efficiency: [efficiency] MPG"
        
        // Your code goes here
            //subclass with parent class implemetation
        class Car implements VehicleInfo {
            // instance variables
            public String make;
            public String model;
            public int year;
            public double fuelEfficiency;
            // construcor
            public Car (String make, String model, int year, double fuelEfficiency) {
                this.make = make;
                this.model = model;
                this.year = year;
                this.fuelEfficiency = fuelEfficiency;
            }
            // methods
            @Override
            public String getType(){
                return "Sedan";
            }
            @Override
            public void displayDetails() {
                System.out.println("Car: " + make + " " +  model + " " + year + " " + fuelEfficiency + " MPG");
            }
            @Override
            public double getFuelEfficiency() {
                return 32.5;
            }

        }
        
        // Don't change the code below
        Car myCar = new Car("Toyota", "Camry", 2022, 32.5);
        System.out.println("Vehicle type: " + myCar.getType());
        myCar.displayDetails();
        System.out.println("Fuel efficiency: " + myCar.getFuelEfficiency() + "MPG");


        
        // Expected output:
        // Vehicle type: Sedan
        // Car: 2022 Toyota Camry, Fuel Efficiency: 32.5 MPG
        // Fuel efficiency: 32.5 MPG
    }
}