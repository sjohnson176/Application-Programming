package programmingEx1;
import java.util.Scanner;

public class Exercise05_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int temp = 0;
		int count = 0;
		int max = 0;
		
		for (int number = -1; number != 0;) {
			System.out.print("Enter an integer (0 ends the input): ");
			number = input.nextInt();
			
			if (number == max) {
				max = number;
				count++;
			}
			else if (number > max) {
				max = number;
				count = 1;
			}
			else 
				continue;
		}
		
		System.out.println("The max is " + max);
		System.out.println("The count for the max is " + count);
	}
}