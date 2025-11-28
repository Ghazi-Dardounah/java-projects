package me;
import java.util.Scanner;
class Account {
	private String name;
	private int id;
	private double balance;
	
	public void setBalance(double b) {
		if(b < 0) {
			System.out.println("Not Allowed.");
		}
		else {
			balance = b ; 
		}
	}
	
	public void userInput() { 
		Scanner ghazi = new Scanner(System.in);
		System.out.println("Enter the Account id: ");
		id = ghazi.nextInt();
		System.out.println("Enter Account holder: ");
		name = ghazi.next();
		System.out.println("Enter the Balance (In SAR) :");
	    double x = ghazi.nextDouble();
	    setBalance(x);
	}
	public void displayinfo() {
		System.out.println("\tAccount information");
		System.out.println("ID: "+id);
		System.out.println("Account holder: "+name);
		System.out.println("balance: "+balance);
	}
	public void sarToUS() {
		System.out.println("The balance in US: "+ (balance/3.75));
	}
	
}

