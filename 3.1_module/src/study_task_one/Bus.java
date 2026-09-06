package study_task_one;

public class Bus extends Car {
    private int passengers;
    Bus (String typeName){
        super(typeName);
        passengers = 0;
    }
    public void passengerEnter(){
        passengers += 1;
        
    }
    public void passengerExit() {
        if (passengers > 0) {
            passengers -= 1;
        }
    }
    public int getPassengers() {
        return passengers;
    }
    
}
