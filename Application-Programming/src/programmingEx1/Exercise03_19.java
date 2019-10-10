package programmingEx1;
import java.util.Scanner;

public class Exercise03_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three edges (length in double): ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		double sum = 0;
		
		if ((s1 + s2) < s3) {
			System.out.println("The input is invalid");
		}
		else if ((s1 + s3) < s2) {
			System.out.println("The input is invalid");
		}
		else if ((s2 + s3) < s1) {
			System.out.println("The input is invalid");
		}
		else {
			sum = s1 + s2 + s3;
			System.out.println("The perimeter is " + sum);
		}
	}

}
