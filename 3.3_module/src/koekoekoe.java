import java.util.Scanner;

public class koekoekoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        String cmString = scanner.nextLine();

        //täytä ite
        int cm = Integer.parseInt(cmString);
        double muunnos = cm; 

        System.out.printf("Its " + muunnos / 100);
        
    }
    
}
