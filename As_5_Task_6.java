import java.util.Scanner;

public class As_5_Task_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            
            for (int j = 0; j < height - i; j++) {
                System.out.print("  "); 
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        scanner.close(); 
    }
}

