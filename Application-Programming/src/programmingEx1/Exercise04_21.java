package programmingEx1;
import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String ssn = input.next();
		
		// string must have 11 characters
		if (ssn.length() < 11) {
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		
		// check all characters for format
		if (ssn.charAt(0) < '0' || ssn.charAt(0) > '9') {	//1
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if (ssn.charAt(1) < '0' || ssn.charAt(1) > '9') { // 2
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if (ssn.charAt(2) < '0' || ssn.charAt(2) > '9') { // 3
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if (ssn.charAt(3) != '-') { // 4
			System.out.println(ssn + " is an invalid social security number 4");
			return;
		}
		else if ((int)ssn.charAt(4) < '0' || (int)ssn.charAt(4) > '9') { // 5
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if ((int)ssn.charAt(5) < '0' || (int)ssn.charAt(5) > '9') { // 6
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if (ssn.charAt(6) != '-') { // 7
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if ((int)ssn.charAt(7) < '0' || (int)ssn.charAt(7) > '9') { // 8
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if ((int)ssn.charAt(8) < '0' || (int)ssn.charAt(8) > '9') { // 9
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if ((int)ssn.charAt(9) < '0' || (int)ssn.charAt(9) > '9') { // 10
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else if ((int)ssn.charAt(10) < '0' || (int)ssn.charAt(10) > '9') { // 11
			System.out.println(ssn + " is an invalid social security number");
			return;
		}
		else { // display valid message
			System.out.println(ssn + " is a valid social security number");
		}
	}
}
