package programmingEx1;
import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String entry = input.next();
		char letter = Character.toUpperCase(entry.charAt(0));
		
		// check if input is valid
		if (letter < 'A' || letter > 'Z') {
			System.out.println(letter + " is an invalid input");
			return;
		}
		
		// check if letter is a vowel
		if (letter == 'A') {
			System.out.println(letter + " is a vowel");
		}
		else if (letter == 'E') {
			System.out.println(letter + " is a vowel");
		}
		else if (letter == 'I') {
			System.out.println(letter + " is a vowel");
		}
		else if (letter == 'O') {
			System.out.println(letter + " is a vowel");
		}
		else if (letter == 'U') {
			System.out.println(letter + " is a vowel");
		}
		else {
			System.out.println(letter + " is a consonant");
		}
	}
}
