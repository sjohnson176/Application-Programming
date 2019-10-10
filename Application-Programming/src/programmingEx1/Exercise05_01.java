package programmingEx1;
import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int sum = 0;
		int total = 0;
		float average = 0;
		
		System.out.print("Enter an integer, the input ends if is zero: ");
		int number = -1;
		
		for (;number != 0;) {
			number = input.nextInt();
			
			if (number > 0)
				positive++;
			else if (number < 0)
				negative++;
			else 
				break;
			
			total++;
			sum += number;
			average = sum / (float)total;
			
			
		}
		
		if (total == 0) {
			System.out.println("No numbers are entered except 0");
		}
		else {
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
		}
	}
}