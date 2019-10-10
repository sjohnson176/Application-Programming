package programmingEx2;

import java.util.Date;

public class Exercise09_07 {
	public static void main(String[] args) {
		Account acct1 = new Account(1122, 20000);
		acct1.setAnnualInterestRate(4.5);
		acct1.withdraw(2500);
		acct1.deposit(3000);
		
		System.out.printf("The account balance is " + 
				"%.2f", acct1.getBalance()); 
		System.out.printf("\nThe monthly interest is " 
				+ "%.2f", acct1.getMonthlyInterest());
		System.out.print("\nThe date the account was created is " + 
				acct1.getDateCreated());
	}
}

class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	// constructors
	Account() {
	
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100.0;	
	}

	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12.0;
		return monthlyInterestRate;
	}

	public double getMonthlyInterest() {
		double monthlyInterest = getMonthlyInterestRate() * balance;
		return monthlyInterest;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

}