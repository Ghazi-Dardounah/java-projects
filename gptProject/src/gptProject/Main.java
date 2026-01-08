package gptProject;

public class Main {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(101 , "Ahmed" , 25000);
		Bank.incrementAccounts();
		BankAccount a2 = new BankAccount(303 , "Ghazi" , 5000);
		Bank.incrementAccounts();
		a1.withdraw(20000);
		a2.withdraw(6000);
		a1.deposit(30000);
		a2.deposit(3000);
		a1.displayInfo();
		System.out.println("==============================================");
		a2.displayInfo();
		System.out.println("==============================================");
		System.out.println("total accounts : "+Bank.getTotalAccounts());
	}
	
	

}
