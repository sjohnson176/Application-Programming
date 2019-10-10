package programmingEx1;
import java.util.Scanner;

public class Exercise04_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String entry = input.next();
		char letter = Character.toUpperCase(entry.charAt(0));
		
		if (letter == 'A' || letter == 'B' || letter == 'C') {
			System.out.println("The corresponding number is 2");
		}
		else if (letter == 'D' || letter == 'E' || letter == 'F') {
			System.out.println("The corresponding number is 3");
		}
		else if (letter == 'G' || letter == 'H' || letter == 'I') {
			System.out.println("The corresponding number is 4");
		}
		else if (letter == 'J' || letter == 'K' || letter == 'L') {
			System.out.println("The corresponding number is 5");
		}
		else if(letter == 'M' || letter == 'N' || letter == 'O') {
			System.out.println("The corresonding number is 6");
		}
		else if (letter == 'P' || letter == 'Q' || letter == 'R' 
				|| letter == 'S') {
			System.out.println("The corresponding number is 7");
		}
		else if (letter == 'T' || letter == 'U' || letter == 'V') {
			System.out.println("The corresponding number is 8");
		}
		else if (letter == 'W' || letter == 'X' || letter == 'Y'
				|| letter == 'Z') {
			System.out.println("The corresponding number is 9");
		}
		else {
			System.out.println(entry + " is an invalid input");
		}	
	}
}
