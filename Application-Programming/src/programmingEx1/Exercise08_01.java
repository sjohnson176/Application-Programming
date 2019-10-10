package programmingEx1;
import java.util.Scanner;

public class Exercise08_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3 by 4 matrix row by row: ");
		for(int a = 0; a < matrix.length; a++) {
			for(int b = 0; b < matrix[0].length; b++) {
				matrix[a][b] = input.nextDouble();
			}
		}
		
		for(int c = 0; c < matrix[0].length; c++) {
			System.out.println("Sum of the elements at column " + c + " is "
					+ sumColumn(matrix, c));
		}
		
	}
	
	public static double sumColumn(double[][] matrix, int c) {
		double sum = 0;
		for(int row = 0; row < matrix.length; row++) {
				sum += matrix[row][c];
			}
		
		return sum;
	}
}
