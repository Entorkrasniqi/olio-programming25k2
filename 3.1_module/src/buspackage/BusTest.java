package buspackage;

public class BusTest {
    public static void main(String[] args) {
        Bus cityBus = new Bus("City Bus", 30);

        cityBus.passengerEnter();
        cityBus.passengerEnter();
        cityBus.passengerExit();
        cityBus.passengerExit();
        cityBus.passengerExit();  // Exiting when no passengers

        System.out.println("Final Passenger Count: " + cityBus.getPassengerCount());
    }
}
