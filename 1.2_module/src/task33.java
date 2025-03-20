import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give weight in grams bro: ");
        double grams = Double.parseDouble(scanner.nextLine());

        double luoti = 13.28;
        double naula = 32;
        double leviska = 20;

        double luotijako = luoti / grams;
        double naulajako = naula / luotijako;
        double leviskajako = naulajako / leviska;

        System.out.printf("The weight is %.2f grams, %.2f luoti, %.2f naula, and %.2f leiviskä.%n", grams, luotijako, naulajako, leviskajako);
    }
}
