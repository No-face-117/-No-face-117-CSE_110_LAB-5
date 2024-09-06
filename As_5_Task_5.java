import java.util.Scanner;

public class As_5_Task_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            
            for (int j = 1; j <= width; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }

        scanner.close(); 
    }
}

