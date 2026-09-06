package study_task_one;

public class SportsCar extends Car{
    SportsCar(String typeName){
        super(typeName);
    }
    @Override 
    public void fillTank(){ 
        gasolineLevel = 200;
    }
    @Override 
    public void accelerate(){
        if (gasolineLevel > 0) {
            speed += 20;
            gasolineLevel -= 10;

        }
        else
            speed = 0;
    }
    @Override 
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - (10+amount));
        } else
            speed = 0;

    }

    
}
