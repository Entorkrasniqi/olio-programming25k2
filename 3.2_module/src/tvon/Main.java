package tvon;

// Interface defining behavior for electronic devices
interface PowerControl {
    // Turn the device on
    void turnOn();
    
    // Turn the device off
    void turnOff();
    
    // Check if device is powered on
    boolean isPowered();
}

public class Main {
    public static void main(String[] args) {
        // TODO:
        // Create a TV class that implements PowerControl interface*
        // It should:
        // 1. Have a boolean attribute 'powered' to track power state*
        // 2. Implement all methods required by the interface*
        // 3. Display "TV turning on" when turned on*
        // 4. Display "TV turning off" when turned off
        
        // Your code goes here
        class TV implements PowerControl {
            boolean powered = false;

            @Override
            public void turnOff(){
                powered = false;
                System.out.println("TV turning off " );
            }

            @Override
            public void turnOn(){
                powered = true;
                System.out.println("TV turning on " );
            }

            public boolean isPowered() {
                return powered;
            }


        }
        
        
        // Don't change the code below
        TV tv = new TV();
        tv.turnOn();
        System.out.println("Is TV on? " + tv.isPowered());
        tv.turnOff();
        System.out.println("Is TV on? " + tv.isPowered());
        
        // Expected output:
        // TV turning on
        // Is TV on? true
        // TV turning off
        // Is TV on? false
    }
}