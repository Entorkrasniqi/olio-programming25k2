import java.io.*;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        // Number of Fibonacci numbers to generate
        int n = 60;

        // List to store the Fibonacci numbers
        List<Long> fibonacciSequence = new ArrayList<>();

        // Initialize the first two Fibonacci numbers
        fibonacciSequence.add(0L); // 0th Fibonacci number
        fibonacciSequence.add(1L); // 1st Fibonacci number

        // Generate the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            long nextNumber = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            fibonacciSequence.add(nextNumber);
        }

        // Write the Fibonacci sequence to a CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("fibonacci_sequence.csv"))) {
            for (int i = 0; i < fibonacciSequence.size(); i++) {
                writer.write(fibonacciSequence.get(i).toString());
                if (i < fibonacciSequence.size() - 1) {
                    writer.write(","); // Write a comma separator if it's not the last element
                }
            }
            writer.newLine(); // Ensure the file ends with a newline

            System.out.println("Fibonacci sequence generated and written to 'fibonacci_sequence.csv'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
