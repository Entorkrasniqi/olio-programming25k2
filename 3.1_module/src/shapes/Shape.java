package shapes;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;  // Default area, overridden in subclasses
    }

    public String getColor() {
        return color;
    }
}
