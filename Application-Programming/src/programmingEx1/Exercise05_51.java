package programmingEx1;
import java.util.Scanner;

public class Exercise05_51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// colect 2 strings from the user
		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String str2 = input.nextLine();
		
		// find shortest string
		int min;
		if (str1.length() <= str2.length()) {
			min = str1.length();
		}
		else {
			min = str2.length();
		}
		
		String common = "";
		for(int a = 0; a <= min - 1; a++) {
			if (str1.charAt(a) == str2.charAt(a)) {
				common += str1.charAt(a);
			}
			else {
				break;
			}
		}
		
		if (common == "") {
			System.out.println(str1 + " and " + str2 + 
					" have no common prefix");
		}
		else {
			System.out.println("The common prefix is " + common);
		}
	}
}
