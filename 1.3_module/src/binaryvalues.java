import java.util.Scanner;

public class binaryvalues {
    public static void main(String[] args) {
//input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number: ");

        String binaryStr = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) != '0' && binaryStr.charAt(i) != '1') {
                System.out.println("Error: Input must be only 0s and 1s.");
                return;
            }
        }
//binääri converter
        int decimalValue = 0;
        int length = binaryStr.length();

        for (int i = 0; i < length; i++) {
            int bit = binaryStr.charAt(i) - '0'; // Convert char '0' or '1' to int 0 or 1
            decimalValue += bit * Math.pow(2, length - 1 - i);
        }

        System.out.println("Decimal: " + decimalValue);
    }
}
