package shapes;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Red", 5.0),
                new Rectangle("Blue", 4.0, 6.0),
                new Triangle("Green", 3.0, 8.0)
        };

        System.out.println("Shape Calculator\n");

        for (Shape shape : shapes) {
            System.out.println("Color: " + shape.getColor() + ", Area: " + shape.calculateArea());
        }
    }
}
