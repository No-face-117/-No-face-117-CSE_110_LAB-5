import java.util.Scanner;

public class As_5_Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N must be greater than 0.");
           // return;
        }

        int count = 0; 
        int num = 2; 

        while (count < N) {
            int divs = 0;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    divs++;
                    break;
                }
            }

            if (divs == 0) {
                System.out.println(num); 
                count++;
            }

            num++; 
        }

        scanner.close(); 
    }
}

