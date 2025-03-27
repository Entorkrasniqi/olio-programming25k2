import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        
        System.out.println("The array without duplicates:");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
