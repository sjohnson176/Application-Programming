package programmingEx1;
import java.util.Scanner;

public class Exercise06_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string for password: ");
		String pass = input.next();
		
		
		
		if (!hasEightDigits(pass)) {
			System.out.println("Invalid Password");
		}
		else if (!lettersAndDigits(pass)) {
			System.out.println("Invalid Password");
		}
		else if (!hasTwoDigits(pass)) {
			System.out.println("Invalid Password");
		}
		else {
			System.out.println("Valid Password");
		}
	}
	
	public static boolean hasEightDigits(String pass) {
		boolean hasEightDigits = true;
		
		if (pass.length() < 8) {
			hasEightDigits = false;
		}
		
		return hasEightDigits;
	}
	
	public static boolean lettersAndDigits(String pass) {
		boolean lsAndDs = true;
		
		for(int a = 0; a <= pass.length() - 1; a++) {
			if (!Character.isLetterOrDigit(pass.charAt(a))) {
				lsAndDs = false;
				return lsAndDs;
			}
		}
		
		return lsAndDs;
	}
	
	public static boolean hasTwoDigits(String pass) {
		boolean hasTwoDigits = true;
		int digits = 0;
		
		for(int a = 0; a <= pass.length() - 1; a++) {
			if (Character.isDigit(pass.charAt(a))) {
				digits++;
			}
		}
		
		if (digits < 2) {
			hasTwoDigits = false;
			return hasTwoDigits;
		}
		else {
			return hasTwoDigits;
		}
	}
}
