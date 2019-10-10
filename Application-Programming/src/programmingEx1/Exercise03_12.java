package programmingEx1;
import java.util.Scanner;

public class Exercise03_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter a three digit integer
		System.out.print("Enter a three digit integer: ");
		int number = input.nextInt();
		
		// get digits from number
		int digit1 = number / 100;
		int digit2 = (number / 10) % 10;
		int digit3 = number % 10;
		
		if (digit1 == digit3)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");
	}
}