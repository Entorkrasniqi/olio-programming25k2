class Theater {
    private int availableSeats;

    public Theater(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized boolean reserveSeat(String customerName, int seatsRequested) {
        // Simulate a delay
        System.out.println(customerName + " is trying to reserve " + seatsRequested + " seat(s).");
        // if seat avaialble reserve the seat, if not available decline the reservation
        if (seatsRequested <= availableSeats) {
            availableSeats -= seatsRequested;
            System.out.println("✅ " + customerName + " successfully reserved " + seatsRequested + " seat(s).");
            System.out.println("🎟️ Seats left: " + availableSeats + "\n");
            return true;
            // Decline the reservation
        } else {
            System.out.println("❌ Sorry, not enough seats for " + customerName + ". Seats left: " + availableSeats + "\n");
            return false;
        }
    }
}

// create method to simulate a customer trying to reserve a seat.

class Customer extends Thread {
    private Theater theater;
    private int seatToBook;
    private String customerName;

    public Customer(Theater theater, int seatToBook, String customerName) {
        this.theater = theater;
        this.seatToBook = seatToBook;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        theater.reserveSeat(customerName, seatToBook);
    }

}
