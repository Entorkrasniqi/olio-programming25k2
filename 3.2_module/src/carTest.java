public class carTest {
    class Car {
        private int speed;
        private String name;
        private double weight;
        private double price;

        public Car(String name, int speed, double weight, double price) {
            this.name = name;
            this.speed = speed;
            this.weight = weight;
            this.price = price;
        }

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
}
