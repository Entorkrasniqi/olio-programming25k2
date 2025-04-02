package carpackage;

public class SportsCarMain {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe");
        SportsCar car1 = new SportsCar(person1, "Ferrari", "Vroom");

        car1.drive(); // John Doe drives Ferrari
        person1.drive(car1, 3); // Drives 3 km with sound "Vroom"
    }
}
