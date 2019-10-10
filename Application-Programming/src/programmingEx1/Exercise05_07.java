package programmingEx1;
import java.util.Scanner;

public class Exercise05_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double tuition = 10000;
		int years;
		
		for (years = 0; years < 10; years++) {
			tuition = tuition * 1.05;
		}
		
		System.out.println("Tuition in 10 years is " + tuition);
		
		double sum = tuition;
		for (years = 1; years < 4; years++) {
		    tuition = tuition * 1.05;
		    sum += tuition;
		}
		
		System.out.println(
				"The four-year tuition in ten years is " + sum);
	}
}