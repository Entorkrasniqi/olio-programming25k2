package lamalm;


interface Drawable {
    public void draw();
}


public class LambdaDemo2{

    public static void main(String[] args) {
        int width = 10;
        double length = 13.34;

        Drawable d = () -> System.out.printf("Drawing width: %d, lenght: %.2f", width, length );
        d.draw();
    }
}