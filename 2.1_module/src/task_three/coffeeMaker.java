package task_three;

public class coffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount; 
    
    public coffeeMaker() {
        this.isOn = false;
        this.coffeeType = "espresso";
        this.coffeeAmount = 10;
    }
    public void switchOn() {
        isOn = true;
    }
}

