
import java.util.Scanner;

public class As_5_Task_8{

    public static void main(String args[]){
    
		Scanner scanner = new Scanner(System.in);
		
		int num = 0, start = 0, end = 0, i = 0, rem = 0, temp = 0, counter = 0;
			
		System.out.print("Enter the start number: ");
		start = scanner.nextInt();

		System.out.print("Enter the end number: ");
		end = scanner.nextInt();
		
		System.out.println();

		for(i=start+1; i<end; i++){
		
			temp = i;
			num = 0;

			while(temp != 0){
				rem = temp%10;
				num = num + rem*rem*rem;
				temp = temp/10;
			}

			if(i == num){
			
				if(counter == 0){
					System.out.println("Armstrong Numbers Between "+start+" and "+end+": ");
				}
				System.out.println(i + "  ");
				counter++;
			}
		}
		
		if(counter == 0){
			System.out.print("There is no Armstrong number Between "+start+" and "+end);
		}
		
		scanner.close();
    }
}