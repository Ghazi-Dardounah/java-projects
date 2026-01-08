package gptProject;

public class BankAccount {
	private int accountNumber;
	private String ownerName;
	private double balance;

	public BankAccount(int accountNumber, String ownerName) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		balance = 0;
	}

	public BankAccount(int accountNumber, String ownerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid amount");
		}
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient balnce\n==============================");
		} else {
			balance -= amount;
		}
	}

	public void displayInfo() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account owner : " + ownerName);
		System.out.println("Account balance : " + balance);
	}

}
