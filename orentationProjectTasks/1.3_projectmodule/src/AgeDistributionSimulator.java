import java.util.*;

public class AgeDistributionSimulator {

    static class AgeRange {
        int age;
        double cumulativeProbability;

        AgeRange(int age, double cumulativeProbability) {
            this.age = age;
            this.cumulativeProbability = cumulativeProbability;
        }
    }

    public static void main(String[] args) {
        // Define age distribution (Cumulative)
        List<AgeRange> distribution = List.of(
                new AgeRange(20, 0.10),
                new AgeRange(21, 0.30),
                new AgeRange(22, 0.65),
                new AgeRange(23, 0.90),
                new AgeRange(24, 1.00)
        );

        int[] ageCount = new int[100]; // enough for all possible ages
        Random random = new Random();

        // Draw 1000 samples
        for (int i = 0; i < 1000; i++) {
            double r = random.nextDouble();
            for (AgeRange ar : distribution) {
                if (r <= ar.cumulativeProbability) {
                    ageCount[ar.age]++;
                    break;
                }
            }
        }

        // Print results
        System.out.println("Generated Age Distribution (1000 samples):");
        for (AgeRange ar : distribution) {
            System.out.printf("Age %d: %d\n", ar.age, ageCount[ar.age]);
        }
    }
}
