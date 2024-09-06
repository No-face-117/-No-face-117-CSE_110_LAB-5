import java.util.Scanner;

public class As_5_Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                System.out.println("ODD number detected !!");
                break;
            }

            int divisorsCount = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisorsCount++;
                }
            }

            System.out.println(number + " has " + divisorsCount + " divisors");
        }

        scanner.close(); 
    }
}

