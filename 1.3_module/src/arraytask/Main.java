package arraytask;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};

        // complete the code below

        if (numbers.length == 0) {
            System.out.println("Array is empty");
        } else {
            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Maximum value: " + max);
        

        }
            

            // create a variable
            // create a variable

        
            
        
        
    }
}
