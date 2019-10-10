package programmingEx1;

import java.util.Scanner;

public class Exercise02_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to input weight in pounds and height in inches
		System.out.print("Enter a number for weight in pounds");
		double weightLb = input.nextDouble();
		System.out.print("Enter a number for height in inches");
		double heightInch = input.nextDouble();
		
		// Convert pounds to kilograms and inches to meters
		final double convert2Kg = .45359237;
		final double conver2Meters = 0.0254;
		double weightKg = weightLb * convert2Kg;
		double heightMeter = heightInch * conver2Meters;
		
		// Compute BMI
		double bmi = weightKg / Math.pow(heightMeter, 2); 
		
		// Display result
		System.out.println("Your BMI is " + bmi); 
	}
}