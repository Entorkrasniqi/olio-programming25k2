import java.util.Scanner;

public class quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        double anumber = Integer.parseInt(scanner.nextLine());
        double bnumber = Integer.parseInt(scanner.nextLine());
        double cnumber = Integer.parseInt(scanner.nextLine());
        double quadraticformula = bnumber * bnumber - 4 * anumber * cnumber;

        if (quadraticformula > 0) {
            double root1 = (-bnumber + Math.sqrt(quadraticformula)) / (2 * anumber);
            double root2 = (-bnumber - Math.sqrt(quadraticformula)) / (2 * anumber);
            System.out.println("The roots are: " + root1 + " and " + root2);
        }
        else if (quadraticformula == 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("No real roots boss");
        }
    }
}