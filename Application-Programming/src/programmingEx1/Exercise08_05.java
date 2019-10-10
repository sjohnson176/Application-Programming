package programmingEx1;
import java.util.Scanner;

public class Exercise08_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter matrix1: ");
		double[][] matrix1 = new double[3][3];
		for(int a = 0; a < matrix1.length; a++) {
			for(int b = 0; b < matrix1[0].length; b++) {
				matrix1[a][b] = input.nextDouble();
			}
		}
		
		System.out.println("Enter matrix2: ");
		double[][] matrix2 = new double[3][3];
		for(int c = 0; c < matrix2.length; c++) {
			for(int d = 0; d < matrix2[c].length; d++) {
				matrix2[c][d] = input.nextDouble();
			}
		}
		
		double[][] matrixProduct = add2Matrices(matrix1, matrix2);
		
		System.out.println("The addition of the matrices is ");
		printProduct(matrix1, matrix2, matrixProduct);
	}
	
	public static double[][] add2Matrices(
			double[][] m1, double[][] m2) {
		
		double[][] newMatrix = new double[3][3];
		for(int a = 0; a < newMatrix.length; a++) {
			for(int b = 0; b < newMatrix[0].length; b++) {
				newMatrix[a][b] = m1[a][b] + m2[a][b];
			}
		}
		
		return newMatrix;
	}
	
	public static void printProduct(
			double[][] m1, double[][] m2, double[][] mP) {
		
		for(int a = 0; a < m1.length; a++) {
				if (a == 1) {
					System.out.printf(
							"%1.1f %1.1f %1.1f", m1[a][0], m1[a][1], m1[a][2]);
					System.out.print("  +   ");
					
					System.out.printf(
							"%1.1f %1.1f %1.1f", m2[a][0], m2[a][1], m2[a][2]);
					System.out.print("  =   ");
					
					System.out.printf(
							"%1.1f %1.1f %1.1f", mP[a][0], mP[a][1], mP[a][2]);
					System.out.println();
				}
				else {
					System.out.printf(
							"%1.1f %1.1f %1.1f", m1[a][0], m1[a][1], m1[a][2]);
					System.out.print("      ");
					
					System.out.printf(
							"%1.1f %1.1f %1.1f", m2[a][0], m2[a][1], m2[a][2]);
					System.out.print("      ");
					
					System.out.printf(
							"%1.1f %1.1f %1.1f", mP[a][0], mP[a][1], mP[a][2]);
					System.out.println();
				}
			
		}
	}
}
