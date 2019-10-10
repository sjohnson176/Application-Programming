package programmingEx1;
import java.util.Scanner;

public class Exercise04_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of sides: ");
		double n = input.nextDouble();
		System.out.print("Enter length of a side: ");
		double s = input.nextDouble();
		
		double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		
		System.out.println("The area of the polygon is " + area);
	}
}