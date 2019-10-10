package programmingEx1;
import java.util.Scanner;

public class Exercise06_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		String str = string.toUpperCase();
		
		System.out.print("Enter a character: ");
		String character = input.next();
		String chCap = character.toUpperCase();
		char ch = chCap.charAt(0);
		
		System.out.println("The number of occurences of " + character 
			+ " in " + string + " is " + count(str, ch));
	}
	
	public static int count(String str, char a) {
		int count = 0; 
		
		for(int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == a)
				count++;
				
		}	
			return count;
		
	}
}