import java.util.Scanner;
public class task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give first lenght: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("give second lenght: ");
        double b = Double.parseDouble(scanner.nextLine());

        double hypotenuse = Math.sqrt((a * a) + (b * b));

        System.out.printf("The hypotenuse of the triangle is: %.2f ", hypotenuse);

        scanner.close();
    }
}
