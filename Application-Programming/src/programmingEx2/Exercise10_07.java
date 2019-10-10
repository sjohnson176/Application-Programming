package programmingEx2;

import java.util.Date;
import java.util.Scanner;

public class Exercise10_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account1[] accounts = new Account1[10];
		for (int a = 0; a < accounts.length; a++) {
			accounts[a] = new Account1();
			accounts[a].setBalance(100);
		}
		
		int id = getID();
		// System.out.println("account ID is " + acct);
		
		displayMainMenu();
		for (;;) {
			System.out.println("Enter a choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 1: displayBalance(accounts[id]);
			break;
			case 2: makeWithdrawl(accounts[id]);
			break;
			case 3: makeDeposit(accounts[id]);
			break;
			case 4: id = getID();
			break;
			}
		}
	}

	public static int getID() {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter an id: ");
		int id = 10;
		for (int a = 0; a == 0;) {
			id = input.nextInt();
			if (id < 0 || id > 9) {
				System.out.println("Enter a correct id: ");
				continue;
			}
			else {
				break;
			}
		}
		
		return id;
	}
	
	public static void displayMainMenu() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Main menu \n1: check balance \n2: withdraw" 
			+ "\n3: deposit \n4: exit");
	}
	
	public static void displayBalance(Account1 account) {
		System.out.println("The balance is " + account.getBalance());
	}
	
	public static void makeWithdrawl(Account1 account) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount to withdraw: ");
		double amount = input.nextDouble();
		account.withdraw(amount);
	}
	
	public static void makeDeposit(Account1 account) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount to deposit: ");
		double amount = input.nextDouble();
		account.deposit(amount);
	}
}

class Account1 {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	// constructors
	Account1() {
	
	}

	Account1(int id, double balance) {
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

