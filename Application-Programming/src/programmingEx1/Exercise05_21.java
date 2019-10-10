package programmingEx1;
import java.util.Scanner;

public class Exercise05_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		System.out.print("Enter loan period (in years): ");
		int loanPeriod = input.nextInt();
		
		double interestRate = 0;
		double monthlyInterestRate = 0;
		double monthlyPayment = 0;
		double totalPayment = 0;
		
		System.out.printf("%s %20s %20s", 
			"Interest Rate", "Monthly Payment", "Total Payment");
		
		for (interestRate = 5.000; interestRate <= 8.000; interestRate = interestRate + 0.125) {
			
			monthlyInterestRate = interestRate / 1200;
			monthlyPayment = loanAmount * monthlyInterestRate / (1 
				-1 / Math.pow(1 + monthlyInterestRate, loanPeriod * 12));
			totalPayment = monthlyPayment * 12 * loanPeriod;
			
			System.out.printf("\n%.3f%% %20.2f %20.2f", 
				interestRate, monthlyPayment, totalPayment);
		}
	}
}