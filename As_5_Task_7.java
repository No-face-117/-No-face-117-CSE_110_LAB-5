import java.util.Scanner;

public class As_5_Task_7 {
    public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in); 
		
        System.out.print("Enter the height of the triangle: ");
		int rows = scanner.nextInt(); 

		for (int i = 1; i <= rows; i++) { 

			for (int j = rows; j >= i; j--) { 
				System.out.print(" "); 
			} 

			for (int j = 1; j <= i; j++) { 
				System.out.print(j+" "); 
			} 

			System.out.println(); 
		} 
	} 
}

