public class NumberPrinter {
    private final int max;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public void startPrinting() {
        Thread oddFirst = new Thread(() -> {
            if (1 <= max) {
                System.out.println("Odd ");
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= max; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        });

        Thread remainingOdds = new Thread(() -> {
            for (int i = 3; i <= max; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        });

        // ekan odd printtaus
        oddFirst.start();
        try {
            oddFirst.join(); // Wait until 1 is printed
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Alota even thread
        evenThread.start();
        try {
            evenThread.join(); // Oottaa että loput threadit printantuu
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Alota loput
        remainingOdds.start();
        try {
            remainingOdds.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Printing complete.");
    }

    public static void main(String[] args) {
        int maxNumber = 20; // Range et kui pitkälle printtaa
        NumberPrinter printer = new NumberPrinter(maxNumber);
        printer.startPrinting();
    }
}
