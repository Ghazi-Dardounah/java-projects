package labExams;

import java.util.Scanner;

class Currency1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double amount;
		String desiredCurrency;
		int CashLimit = 0;
		System.out.print("Enter the amount in SAR: ");
		amount = input.nextDouble();
		System.out.print("Enter the desired currency: ");
		desiredCurrency = input.next().toUpperCase();
		if (desiredCurrency.equals("USD")) {
			amount = amount / 3.75;
			CashLimit = 10000;
		} else if (desiredCurrency.equals("EUR")) {
			amount = amount / 4.67;
			CashLimit = 15000;
		} else if (desiredCurrency.equals("GBP")) {
			amount = amount / 3.98;
			CashLimit = 20000;
		} else if (desiredCurrency.equals("CAD")) {
			amount = amount / 2.79;
			CashLimit = 25000;
		} else {
			System.out.println("INVALID!");
			System.exit(0);
		}
		System.out.printf("The amount %.2f is within the limits %,d %s .",amount , CashLimit ,desiredCurrency );
		input.close();

	}

}
