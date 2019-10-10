package programmingEx2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
	public static void main(String[] args) throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		boolean bothInts = false;
		do {
			System.out.println("Enter an integer:");
			try {
				n1 = input.nextInt();
			}
			catch (InputMismatchException ex) {
				System.out.println("InputMismatchException. An integer is required" + 
						"\nTry again.");
				input.nextLine();
				continue;
			}
			
			System.out.println("Enter another integer:");
			try {
				n2 = input.nextInt();
			}
			catch (InputMismatchException ex) {
				System.out.println("InputMismatchException. An integer is required" + 
						"\nTry again.");
				input.nextLine();
				continue;
			}
			
			bothInts = true;
		}
		while (!bothInts);
		
		int sum = n1 + n2;
		System.out.println("The sum is " + sum);
	}
}
