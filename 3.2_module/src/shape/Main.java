package shape;

// Interface for shapes
interface Shape {
    // Calculate the area of the shape
    double calculateArea();
    
    // Calculate the perimeter of the shape
    double calculatePerimeter();
}

public class Main {
    public static void main(String[] args) {
        // TODO:
        // 1. Create a Circle class that implements the Shape interface*
        // 2. Add radius attribute and constructor*
        // 3. Implement the required interface methods
        // 4. For circle: area = Math.PI * radius * radius
        //               perimeter = 2 * Math.PI * radius
        
        // Your code goes here

        class Circle implements Shape {
            public double radius;

            public Circle (double radius){
                this.radius = radius;
            }
            public double calculateArea() {
                return Math.PI * radius * radius;
            }
            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }
            
        }
        
        // Don't change the code below
        Circle circle = new Circle(5.0);
        System.out.println("Circle with radius " + circle.radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        // Expected output:
        // Circle with radius 5.0
        // Area: 78.53981633974483
        // Perimeter: 31.41592653589793
    }
}