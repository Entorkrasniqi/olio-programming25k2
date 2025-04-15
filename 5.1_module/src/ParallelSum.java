import java.util.Random;

public class ParallelSum {
    static class SumTask extends Thread {
        private int[] array;
        private int start, end;
        private long partialSum;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        public long getPartialSum() {
            return partialSum;
        }

        @Override
        public void run() {
            partialSum = 0;
            for (int i = start; i < end; i++) {
                partialSum += array[i];
            }
        }
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();

        // Generate random integers
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); // 0 to 99
        }

        // Get the number of cores
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + cores);

        SumTask[] tasks = new SumTask[cores];
        int chunkSize = size / cores;

        // Create and start threads
        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? size : start + chunkSize;
            tasks[i] = new SumTask(numbers, start, end);
            tasks[i].start();
        }

        // Wait for all threads and sum up partial results
        long totalSum = 0;
        try {
            for (SumTask task : tasks) {
                task.join();
                totalSum += task.getPartialSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total sum of array: " + totalSum);
    }
}
