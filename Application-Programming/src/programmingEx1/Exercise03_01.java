package programmingEx1;
import java.util.Scanner;

public class Exercise03_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter values for a,b, and c
		System.out.print("Enter values for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// compute discriminant
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		
		// display results
		if (discriminant > 0) {
			double root1 = (- b + Math.sqrt(discriminant)) / 2 * a;
			double root2 = (- b - Math.sqrt(discriminant)) / 2 * a;
			System.out.println("two roots: " + root1 + " and " + root2);
		}	
		else if (discriminant == 0) {
			double root1 = (- b + Math.sqrt(discriminant)) / 2 * a;
			System.out.println("one root: " + root1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}
}