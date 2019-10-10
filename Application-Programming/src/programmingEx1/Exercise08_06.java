package programmingEx1;
import java.util.Scanner;

public class Exercise08_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];
		for(int a = 0; a < matrix1.length; a++) {
			for(int b = 0; b < matrix1[a].length; b++) {
				matrix1[a][b] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];
		for(int c = 0; c < matrix2.length; c++) {
			for(int d = 0; d < matrix2[c].length; d++) {
				matrix2[c][d] = input.nextDouble();
			}
		}
		
		double[][] newMatrix = multiplyMatrix(matrix1, matrix2);
		
		System.out.println("The multiplication of the matrices is ");
		for(int e = 0; e < newMatrix.length; e++) {
			if (e == 1) {
				System.out.print(
					matrix1[e][0] + " " + matrix1[e][1] + " " + matrix1[e][2] +
					"  *   " +
					matrix2[e][0] + " " + matrix2[e][1] + " " + matrix2[e][2] +
					"  =   " +
					newMatrix[e][0] + " " + newMatrix[e][1] + " " + newMatrix[e][2] + 
					"\n");
			}
			else {
				System.out.print(
					matrix1[e][0] + " " + matrix1[e][1] + " " + matrix1[e][2] + 
					"      " + 
					matrix2[e][0] + " " + matrix2[e][1] + " " + matrix2[e][2] + 
					"      " +
					newMatrix[e][0] + " " + newMatrix[e][1] + " " + newMatrix[e][2] +
					"\n");
			}
		}
	}
	
	public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
		double[][] newMatrix = new double[matrix1.length][matrix1[0].length];
		
		for(int a = 0; a < matrix1.length; a++) {
			for(int b = 0; b < newMatrix.length; b++) {
				for(int c = 0; c < newMatrix[b].length; c++) {
					newMatrix[a][b] += matrix1[a][c] * matrix2[c][b];
				}
			}
		}
		
		return newMatrix;
	}
}