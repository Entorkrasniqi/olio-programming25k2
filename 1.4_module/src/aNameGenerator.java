import java.util.Scanner;
import java.util.*;

public class aNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] firstNames = {"John", "Jane", "Michael", "Emily", "David", "Sarah", "Chris", "Laura"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia"};
        
        System.out.print("How many random names would you like to generate? ");
        int count = scanner.nextInt();
        
        System.out.println("Generated Names:");
        for (int i = 0; i < count; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            System.out.println(firstName + " " + lastName);
        }
        
        scanner.close();
    }
}