package programmingEx1;
import java.util.Scanner;

public class Exercise07_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.next();
		
		int capCount = 0;
		
		for(int a = 0; a <= str.length() - 1; a++) {
			if (str.charAt(a) >= 'A' && str.charAt(a) <= 'Z') {
				capCount++;
			}
		}
		
		System.out.println("The number of uppercase letters is " + capCount);
	}
}