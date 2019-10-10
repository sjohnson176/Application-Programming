package programmingEx1;
import java.util.Scanner;

public class Exercise04_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int num = input.nextInt();
		
		System.out.print("The character for code " +
			num + " is " + (char)num);
	}
}