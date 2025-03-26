class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        this.isOn = false;
        this.coffeeType = "normal"; // Default coffee type
        this.coffeeAmount = 10; // Default coffee amount
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Coffee maker is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Coffee maker is off");
    }

    public void setCoffeeType(String type) {
        if (isOn && (type.equals("normal") || type.equals("espresso"))) {
            this.coffeeType = type;
        }
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            this.coffeeAmount = amount;
        }
    }

    public void displaySettings() {
        if (isOn) {
            System.out.println("Coffee type is " + coffeeType);
            System.out.println("Coffee amount is " + coffeeAmount + " ml");
        }
    }
}

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.turnOn();
        myCoffeeMaker.setCoffeeType("espresso");
        myCoffeeMaker.setCoffeeAmount(50);
        myCoffeeMaker.displaySettings();
        myCoffeeMaker.turnOff();
    }
}

