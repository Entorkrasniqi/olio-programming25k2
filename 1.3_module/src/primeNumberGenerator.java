import java.util.Scanner;

public class primeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start and end numbers: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        if (start >= end || start < 0 || end < 0) {
            System.out.println("Invalid!");
            return;
        }
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}