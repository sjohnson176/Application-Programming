package programmingEx1;
import java.util.Scanner;

public class Exercise05_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		for(int a = 0; a < lines; a++) {
			for(int space = lines - (a + 1); space > 0; space--) {
					System.out.print("   ");
			}
			for(int b = a; b >= 0; b--) {
				if ((b + 1) < 10) {
					System.out.print((b + 1) + "  ");
				}
				else if ((b + 1) > 9) {
					System.out.print((b + 1) + " ");
				}
			}
			if (a > 0) {
				for(int c = 1; c <= a; c++) {
					if ((c + 1) < 10) {
						System.out.print((c + 1) + "  ");
					}
					else if ((c + 1) > 9) {
						System.out.print((c + 1) + " ");
					}
				}
			}
			System.out.println();
		}
	}
}
