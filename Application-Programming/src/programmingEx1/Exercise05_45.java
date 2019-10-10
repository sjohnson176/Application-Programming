package programmingEx1;
import java.util.Scanner;

public class Exercise05_45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declare and initialize total
		double total = 0;
		double sum = 0;
		
		// ask user for 10 numbers
		for(int a = 0; a < 10; a++) {
			System.out.print("Enter a number: ");
			double newNum = input.nextDouble();
			
			// add new number to sum
			total += newNum;
			sum += Math.pow(newNum, 2);
		}
		
		// compute  and display the mean
		double mean = total / 10;
		System.out.println("The mean is " + mean);
		
		// compute and display the standard deviation
		double deviation = Math.sqrt((sum - (Math.pow(total, 2) / 10)) / (10 - 1));
		System.out.println("The standard deviation is " + deviation);
	}
}
