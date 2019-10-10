package programmingEx1;
import java.util.Scanner;

public class Exercise03_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 2.5 4 2.5 43
		System.out.print("Enter r1's center x-, y-coordinates, " + 
				"width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		// 1.5 5 0.5 3
		System.out.print("Enter r2's center x-, y-coordinates, " + 
				"width, and height : ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		
		double xD = Math.abs(x1 - x2);
		double yD = Math.abs(y1 - y2);
		
		if (	(yD + h2 / 2 <= h1 / 2) && (xD + w2 / 2 <= w1 / 2) &&
				(h1 / 2 + h2 / 2 <= h1) && (w1 / 2 + w2 / 2 <= w1)) {
			
			System.out.println("r2 is inside r1");
		}
		else if ((x1 + w1 / 2 > x2 - w2) || (y1 + h1 / 2 > y2 - h2)) {
			System.out.println("r2 overlaps 21");
		}
		else {
			System.out.println("r2 does not overlap r1");
		}
	}
}
