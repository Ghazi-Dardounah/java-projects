package atm;

class Account {
	String name;
	int number;
	double balance;
	String type;

	public Account() {
	}

	public Account(String name, int number, double balance, String type) {
		this.name = name;
		this.number = number;
		this.balance = balance;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public String getType() {
		return type;
	}

	public void deposit(double amount) {
		if (amount < 100) {
			System.out.println("Sorry, Minimum deposit is 100 SAR.");
			System.out.println("--------------------");
			return;
		}
		if (type.equalsIgnoreCase("personal")) {
			this.balance += amount;
			System.out.println("Diposet complete!");
			System.out.println("--------------------");
		} else if (type.equalsIgnoreCase("business")) {
			this.balance += amount - Math.max(50, amount * 0.025);
			System.out.println("Diposet complete!");
			System.out.println("--------------------");
		} else {
			System.out.println("Unknown Type");
			System.out.println("--------------------");
			return;
		}
	}

	public boolean withdraw(double amount) {
		double fee = 0 ; 
		if(type.equals("business")) {
			fee = Math.max(50, amount*0.025);
		}
		if(amount + fee <= balance) {
			this.balance -= amount + fee;
			System.out.println("withdraw complete!");
			System.out.println("--------------------");
			return true;
		}
		else {
			System.out.print("No enough mouney!");
			System.out.println("--------------------");
			return false;
		}

	}
}
