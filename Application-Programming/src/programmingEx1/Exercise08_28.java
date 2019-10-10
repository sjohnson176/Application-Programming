package programmingEx1;
import java.util.Scanner;

public class Exercise08_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
		int[][] m1 = new int[3][3];
		for(int a = 0; a < m1.length; a++) {
			for(int b = 0; b < m1[0].length; b++) {
				m1[a][b] = input.nextInt();
			}
		}
		
		System.out.print("Enter m2 (a 3 by 3 matrix); row by row: ");
		int[][] m2 = new int[3][3];
		for(int c = 0; c < m2.length; c++) {
			for(int d = 0; d < m2[0].length; d++) {
				m2[c][d] = input.nextInt();
			}
		}
		
		System.out.println(equals(m1, m2) ? "The two arrays are strictly "
				+ "identical" : "The two arrays are not strictly identical");;
	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		boolean identical = true;
		
		for(int a = 0; a < m1.length; a++) {
			for(int b = 0; b < m1[0].length; b++) {
				if (m1[a][b] != m2[a][b]) {
					identical = false;
					return identical;
				}
			}
		}
		
		return identical;
	}
}
