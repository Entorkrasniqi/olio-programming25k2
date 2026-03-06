public class carTest {
    // a class which is called Car and inside it class's Data (fields) speed, name, weight, price
    class Car {
        private int speed;
        private String name;
        private double weight;
        private double price;

        // constructor of Car class
        public Car(String name, int speed, double weight, double price) {
            this.name = name;
            this.speed = speed;
            this.weight = weight;
            this.price = price;
        }

        // getter method's for the name, speed, weight, price fields
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public String getName() {
            return name;
        }
        public double getWeight() {
            return weight;
        }
        public double getPrice() {
            return price;
        }
    }

    public void accelerate(Car car) {
        car.setSpeed(car.getSpeed() + 1);
        System.out.println(car.getSpeed());
    }

    public void breakCar(Car car) {
        car.setSpeed(car.getSpeed() - 1);
        System.out.println(car.getSpeed());
    }
}

