package programmingEx2;

public class Exercise11_03 {
	public static void main(String[] args) {
		Account a1 = new Account();
		System.out.println("OG account\n" + a1.getBalance());
		a1.deposit(500.00);
		System.out.println(a1.getBalance());
		a1.withdraw(200.00);
		System.out.println(a1.getBalance());
		System.out.println(a1.toString() + "\n");
		
		SavingsAccount a2 = new SavingsAccount();
		System.out.println("Savings account\n" + a2.getBalance());
		a2.deposit(500.00);
		System.out.println(a2.getBalance());
		a2.withdraw(200.00);
		System.out.println(a2.getBalance());
		a2.withdraw(350.00);
		System.out.println(a2.getBalance());
		System.out.println(a2.toString() + "\n");
		
		CheckingAccount a3 = new CheckingAccount();
		System.out.println("Cheking account\n" + a3.getBalance());
		a3.deposit(500.00);
		System.out.println(a3.getBalance());
		a3.withdraw(200.00);
		System.out.println(a3.getBalance());
		a3.withdraw(350.00);
		System.out.println(a3.getBalance());
		System.out.println(a3.toString() + "\n");
	}
}

class CheckingAccount extends Account {
	private final double overdraftLimit = -50.0;
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
}

class SavingsAccount extends Account {
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount >= 0) {
			setBalance(getBalance() - amount);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
}