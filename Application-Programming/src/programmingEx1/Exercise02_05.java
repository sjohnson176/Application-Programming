package programmingEx1;

import java.util.Scanner;

public class Exercise02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Receive subtotal and gratuity rate
		System.out.print("Enter numbers for subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble() / 100;
		
		// Compute gratuity and total
		double gratuity = subtotal * gratuityRate;
		double total = subtotal + gratuity; 
		
		// Display result
		System.out.println("The gratuity is $" + gratuity + 
		" and the total is $" + total);
	}
}