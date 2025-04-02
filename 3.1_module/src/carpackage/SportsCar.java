package carpackage;
public class SportsCar {
    private Person owner;
    private String model;
    //private int    gears;
    private String sound;
    
    public SportsCar(Person owner, String model, String sound) {
       this.owner = owner;
       this.model = model;
       //this.gears = gears;
       this.sound = sound;
    }
    
    public void drive() {
       System.out.println(this.model + ": " + owner.getName() + " drives");
    }
 
    public String getSound() {
       return sound;
    }
 }