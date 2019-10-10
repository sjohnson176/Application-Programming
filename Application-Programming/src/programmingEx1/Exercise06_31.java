package programmingEx1;
import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(
				"Enter a credit card number as a long interger: ");
		long number = input.nextLong();
		boolean isValid = isValid(number);
		System.out.println(isValid ? number + " is valid": 
			number + " is invalid");
	}
	
	public static boolean isValid(long number) {
		boolean isValid = true;
		
		int step2Tot = sumOfDoubleEven(number);
		int step3Tot = sumOfOdd(number);
		if ((step2Tot + step3Tot) % 10.0 != 0) {
			isValid = false;
			return isValid;
		}
		
		return isValid;
	}
	
	public static int sumOfDoubleEven(long number) {
		int sum = 0;
		String numStr = number + "";
		
		for (int a = 0; a <= numStr.length() - 1; a++) {
			String twoDigit = "";
			if (a % 2.0 == 0) {
				int digit = getDigit(Integer.parseInt(numStr.charAt(a)
						+ "") * 2);
				sum += digit;
			}
		}
		
		System.out.println("Sum is " + sum);
		
		return sum;
	}
	
	public static int getDigit(int digit) {
		String twoDigit = "";
		
		if (digit > 9) {
			twoDigit = digit + "";
			digit = Integer.parseInt(twoDigit.charAt(0) + "") + 
					Integer.parseInt(twoDigit.charAt(1) + "");
			return digit;
		}
		else {
			return digit;
		}
	}
	
	public static int sumOfOdd(long number) {
		int sum = 0;
		String numStr = number + "";
		
		for(int a = 0; a <= numStr.length() - 1; a++) {
			if (a % 2.0 != 0) {
				sum += Integer.parseInt(numStr.charAt(a) + "");
			}
		}
		
		System.out.println("Sum is " + sum);
		
		return sum;
	}
	
	
}
