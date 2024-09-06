import java.util.Scanner;

public class As_5_Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of test cases : ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
  
            System.out.println("Enter X value : ");
            int X = scanner.nextInt();

            System.out.println("Enter Y value : ");
            int Y = scanner.nextInt();
 
            int sum = 0;
            int oddCount = 0;
      
            if (X % 2 == 0) {
                X++; 
            }
 
            while (oddCount < Y) {
                sum += X;
                X += 2; 
                oddCount++;
            }

            System.out.println();
            System.out.println("SUM : " + sum);
            System.out.println();
        }

        scanner.close(); 
    }
}

