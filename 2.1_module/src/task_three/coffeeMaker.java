package task_three;

// zone - 1 class and its variables(data)
public class coffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount; 
//zone - 2 constructors   
    public coffeeMaker() {
        this.isOn = false;
        this.coffeeType = "espresso";
        this.coffeeAmount = 10;
    }
// zone - 3 methods (logic)
    public void switchOn() {
        isOn = true;
    }
    public void switchOff () {
        isOn = false;
    }
    public void setAmount(int coffeeAmount) {
        if (isOn && coffeeAmount >= 10 && coffeeAmount <= 80) {
            this.coffeeAmount = coffeeAmount;
        }
    }
     public void setType(String coffeeType) {
        if (isOn && (coffeeType.equals("espresso") || coffeeType.equals("normal"))) {
            this.coffeeType = coffeeType;
        }
    }
// zone - 4 accessor methods
    public String getcoffeeType() {
        return coffeeType;
    }

    public int getcoffeeAmount() {
        return coffeeAmount;
    }
    
}

