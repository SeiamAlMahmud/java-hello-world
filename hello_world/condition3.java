import java.util.*;

public class condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (1-3): ");
        int num = sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("You entered one");
                break;
            case 2:
                System.out.println("You entered Two");
                break;
            case 3:
                System.out.println("You entered Three");
                break;
        
            default:
                System.out.println("Invalid number! Please enter 1, 2, or 3.");
                break;
        }
    }
}
