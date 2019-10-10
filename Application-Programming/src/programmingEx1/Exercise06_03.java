package programmingEx1;
import java.util.Scanner;

public class Exercise06_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		String num = input.next();
		
		System.out.println(isPalindrome(num) ? num + " is a palindrome": 
				num + " is not a palindrome");
		
		
	}
	
	public static boolean isPalindrome(String num) {
		boolean isPalindrome = false;
		
		// create newNum and store the reverse of num in it
		String newNum = "";
		for(int a = num.length() - 1; a >= 0; a--) {
			newNum += num.charAt(a) + "";
		}
		
		// check if new number is same is original number
		if (newNum.equals(num)) {
			isPalindrome = true;
		}
		
		return isPalindrome;
	}
}
