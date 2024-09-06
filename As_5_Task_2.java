import java.util.Scanner;

public class As_5_Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N must be greater than 0.");
            //return;
        }

        int y = 0;
  
        for (int i = 1; i <= N; i++) {
            int sum = 0;
          
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            y -= sum; 
        }

        System.out.println("The value of y: " + y);

        scanner.close(); 
    }
}

