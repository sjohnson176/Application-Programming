package programmingEx1;
import java.util.Scanner;

public class Exercise06_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		for(int a = 0; a < n; a++) {	
			for(int b = 0; b < n; b++) {
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}
