package arar;

public class Main {
    public static void main(String[] args) {
        // TODO:
        // Create a NumberArray class with the following functionality:
        // 1. It should have an integer array as an instance variable
        // 2. Constructor should take an integer array parameter
        // 3. Implement these methods:
        //    - findMax(): Returns the maximum value in the array
        //    - calculateAverage(): Returns the average of all numbers (as double)
        //    - countEvens(): Returns the count of even numbers
        //    - printArray(): Prints all elements in format "[a, b, c, ...]"
        
        // Your code goes here
        class NumberArray {
            public int findMax;
            public int calculateAverage;
            public int countEvens;
            public int[] numbers;

            public NumberArray (int[] numbers) {
            }

            public int findMax () {
                int max = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
                return max;
            }

            public double calculateAverage () {
                int sum = 0;
                for (int number : numbers) {
                    sum += numbers.length;
                }
                return (double) sum / numbers.length;
            }

            public int countEvens () {
                int count = 0;
                for (int number : numbers){
                    if (number % 2 == 0) {
                        count ++;
                    }
                }
                return count;
            }



        }
        
        
        // Don't change the code below
        int[] numbers = {3, 7, 1, 15, 2, 8, 10, 4};
        NumberArray numArray = new NumberArray(numbers);
        
        System.out.println("Array contents: ");
        numArray.printArray();
        System.out.println("Maximum value: " + numArray.findMax());
        System.out.println("Average value: " + numArray.calculateAverage());
        System.out.println("Count of even numbers: " + numArray.countEvens());
        
        // Expected output:
        // Array contents: 
        // [3, 7, 1, 15, 2, 8, 10, 4]
        // Maximum value: 15
        // Average value: 6.25
        // Count of even numbers: 4
    }
}