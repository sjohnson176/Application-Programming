package programmingEx1;
import java.util.Scanner;

public class Exercise08_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		for(int a = 0; a < matrix.length; a++) {
			for(int b = 0; b < matrix[a].length; b++) {
				matrix[a][b] = (int) (Math.random() * 2);
				System.out.print(matrix[a][b]);
			}
			System.out.println();
		}
		
		printLargestRow(matrix);
		printLargestColumn(matrix);
	}
	
	public static void printLargestRow(int[][] matrix) {
		int[] largestRow = matrix[0];
		int indexOfRow = 0;
		int count =0;
		for(int a = 0; a < matrix[0].length; a++) {
			if (matrix[0][a] == 1) {
				count++;
			}
		}
		
		for(int b = 1; b < matrix.length; b++) {
			int newCount = 0;
			for(int c = 0; c < matrix[b].length; c++) {
				if (matrix[b][c] == 1) {
					newCount++;
				}
			}
			if (count < newCount) {
				count = newCount;
				largestRow = matrix[b];
				indexOfRow = b;
			}
		}
		
		System.out.println("The largest row index: " + indexOfRow);
		
	}
	
	public static void printLargestColumn(int[][] matrix) {
		int indexOfColumn = 0;
		int count = 0;
		for(int a = 0; a < matrix.length; a++) {
			if (matrix[a][0] == 1) {
				count++;
			}
		}
		
		for(int b = 1; b < matrix[0].length; b++) {
			int newCount = 0;
			for(int c = 0; c < matrix.length; c++) {
				if (matrix[c][b] == 1) {
					newCount++;
				}
			}
			
			if (count < newCount) {
				count = newCount;
				indexOfColumn = b;
			}
			
		}
		
		System.out.println("The largest column index: " + indexOfColumn);
		
	}
}
