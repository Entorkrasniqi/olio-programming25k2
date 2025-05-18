package multiply;

// Base class provided
class Animal {
    protected String name;
    //constructor
    public Animal(String name) { // parameters name and speak with type
        this.name = name; //constuctor one
        
    }
    //method
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}


public class Main {
    public static void main(String[] args) {
        // TODO: Create a Dog class that inherits from Animal
        // The Dog class should:
        // 1. Override the speak method to print "[name] says: Woof!"
        
        // Your code goes here
        class Dog extends Animal {
            public Dog (String name){
                super(name);
                this.name = name; // constructor two
            }

            @Override
            public void speak() {
                System.out.println(name + " says: Woof!");
            }
        }
        
        // Don't change the code below
        Dog dog = new Dog("Rex");
        dog.speak();
        
        // Expected output:
        // Rex says: Woof!
    }
}