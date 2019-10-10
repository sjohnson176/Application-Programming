package programmingEx1;
import java.util.Scanner;

public class Exercise07_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10];
		System.out.print("Enter 10 double numbers: ");
		for(int a = 0; a < array.length; a++) {
			array[a] = input.nextDouble();
		}
		
		for(int b = 0; b < array.length - 1; b++) {
			for(int c = 0; c < array.length - 1; c++) {
				if (array[c] > array[c + 1]) {
					double temp = array[c];
					array[c] = array[c + 1];
					array[c + 1] = temp;
				}
			}
		}
		
		System.out.println("The numbers sorted are " + java.util.Arrays.toString(array));
	}
}
