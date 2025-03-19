import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give temperature in fahrenheit:");
        int fahrenheit = Integer.parseInt(scanner.nextLine());
        
        double celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }
}
