package programmingEx1;
import java.util.Scanner;

public class Exercise06_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println("The sum of the digits for " + number + " is " 
			+ printSumOfDigits(number));
	}
	
	public static int printSumOfDigits(int number) {
		number = Math.abs(number);
		System.out.println(number);
		int sum = 0;
		
		for(; number != 0;) {
			sum += (number % 10);
			System.out.println("Sum is " + sum);
			number = number / 10;
			System.out.println("Number is " + number);
		}
		
		return sum;
	}
}