package noon;
import java.util.Scanner;
class Account {
	private int number;
	private String name;
	private double balance = 0;
	private String type;
	
	public Account() {}
	public Account(int number , String name , double balance , String type) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.type = type;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	public String getName () {
		return name;
	}
	public String getType() {
		return type;
	}
	public void deposit(double amount) {
		if (amount < 100) {
			System.out.println("minimum deposit is 100!");
			return;
		}
		if(type.equalsIgnoreCase("BUSINESS")) {
			double fee = Math.max(50 , amount *0.025);
			this.balance = amount + balance - fee; 
		}
		else {
			this.balance = amount + balance;
		}
	}
	public boolean withdraw(double amount) {
		double fee = 0;
		if (type.equalsIgnoreCase("business")) {
			fee = Math.max(50 , amount *0.025);
		}
		if (amount + fee <= this.balance ) {
			this.balance = this.balance - amount - fee;
			return true;
		}
		else {
			System.out.println("Not enough money!");
			return false;
		}
	
	}
	public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		System.out.println("please enter account number, name, balance, and type:  ");
		account.setNumber(input.nextInt());
		input.nextLine();
		account.setName(input.nextLine());
		account.setBalance(input.nextDouble());
		account.setType(input.next());
		do {
		System.out.println("Choose your transaction: \n1)deposit\t2)withdraw\t3)show balance\t4)exit");
		int choose = input.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Enter the amount: ");
			double amount = input.nextDouble();
			account.deposit(amount);
			if(amount >= 100) {
			System.out.println("deposit complete!\n--------------------");
			}
			break;
		case 2:
			System.out.println("Enter the amount: ");
		    amount = input.nextDouble();
			boolean ok = account.withdraw(amount);
			if (ok) {
				System.out.println("withdraw complete!\n--------------------");
			}
			break;
		case 3:
			System.out.println("The Account Balance is: "+account.getBalance());
			System.out.println("--------------------");
			break;
		case 4:
			System.exit(0);
		}
		}while(true);
	}

	
}
