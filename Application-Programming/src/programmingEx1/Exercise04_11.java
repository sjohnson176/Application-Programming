package programmingEx1;
import java.util.Scanner;

public class Exercise04_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int num = input.nextInt();
		
		if (0 <= num && num <= 9)
			System.out.println("The hex value is " + num);
		else if (10 <= num && num <= 15) {
			int value = num + 'A' - 10;
			System.out.println("The hex value is " + (char)value);
		}
		else 
			System.out.println(num + " is an invalid input");
	}
}