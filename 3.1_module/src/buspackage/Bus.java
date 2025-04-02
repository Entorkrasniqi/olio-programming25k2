package buspackage;

public class Bus extends Car {
    private int passengerCount;
    private int maxPassengers;

    public Bus(String typeName, int maxPassengers) {
        super(typeName);  // Call the constructor of the Car class
        this.maxPassengers = maxPassengers;
        this.passengerCount = 0;
    }

    public void passengerEnter() {
        if (passengerCount < maxPassengers) {
            passengerCount++;
            System.out.println("One passenger entered. Current passengers: " + passengerCount);
        } else {
            System.out.println("Bus is full! No more passengers can enter.");
        }
    }

    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("One passenger exited. Current passengers: " + passengerCount);
        } else {
            System.out.println("No passengers to exit.");
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
