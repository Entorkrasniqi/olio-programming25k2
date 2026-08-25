package task_three;

public class coffeeMakerDriver {
    public static void main(String[] args) {

        coffeeMaker coffee = new coffeeMaker();
        
        coffee.switchOn();
        System.out.println("coffee maker is on");


        coffee.setType("espresso");
        coffee.setAmount(20);

        coffee.switchOff();
        System.out.println("coffee maker is off");
    

        System.out.println("coffee type is: " + coffee.getcoffeeType());
        System.out.println("coffee amount is: " + coffee.getcoffeeAmount() );
    }
    
}
