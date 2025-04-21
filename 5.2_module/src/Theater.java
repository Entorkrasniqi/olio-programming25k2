public class Theater {
    // step1: Create private seats as variable
    private int AvailableSeats;

    public Theater(int TotalSeats);
    this.AvailableSeats = TotalSeats;
}

//step 2: create a constructor
public synchronized boolean reserveSeat(String CustomerName, int seatReq) {
    // check if the seat is available
    System.out.printIn(CustomerName + " is trying to reserve " + seatReq + " seat(s)."); //method that tries to reserve a seat

    if (seatReq < AvailableSeats) {
        AvailableSeats -= seatReq;
        System.out.println("Reserved " + seatReq + " seat's for " + CustomerName); // method that checks if a seat is available
        System.out.println("🎟️ Seats left: " + AvailableSeats + "\n"); // if yes then it reserves the seat
        return true;
    } else {
        System.out.println("❌ Sorry, not enough seats for " + CustomerName + ". Seats left: " + AvailableSeats + "\n");
        return false; // if not then it returns false

    }



// step 3:

public class TicketReservationSystem {
    public static void main(String[] args) {
        // Set Theater seat limit
        Theater theater = new Theater(30);
        // Simulate multiple customers trying to book at the same time
        Customer customer1 = new Customer("Spiderman", 1, theater);
        Customer customer2 = new Customer("Batman", 5, theater);
        Customer customer3 = new Customer("Wonderwoman", 2, theater);
        Customer customer4 = new Customer("Superman", 4, theater);
        Customer customer5 = new Customer("Flash", 5, theater);


    }
}