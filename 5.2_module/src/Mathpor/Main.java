package Mathpor;

interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // complete below

            MathOperation d = (int a, int b) -> {
                System.out.println("The two integers are: " + a + " and " + b);
                return (0); // Need to return something to satisfy the interface
            };
            System.out.println(d.operate(5, 3));

            

    }
}
