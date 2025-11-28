package labExams;

import java.util.Scanner;

class Currency2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double amount;
		int CashLimit = 0;
		double afterConvert = 0;
		double sub = 0;
		String desiredCurrency;
		do {
			System.out.print("Enter the amount in SAR (-1 to exit) : ");
			amount = input.nextDouble();
			if (amount == -1) {
				System.out.println("Thanks! Goodbye!");
				System.exit(0);
			}
			System.out.print("Enter the desired currency: ");
			desiredCurrency = input.next().toUpperCase();
			switch (desiredCurrency) {
			case "USD":
				afterConvert = amount / 3.75;
				CashLimit = 10000;
				sub = afterConvert - CashLimit;
				if (afterConvert > CashLimit) {
					System.out.printf(
							"Sorry, that's more than the allowed amount (%,d %s) by %.2f\n" ,
							CashLimit, desiredCurrency, sub);
					continue;
				}
				break;
			case "EUR":
				afterConvert = amount / 4.67;
				CashLimit = 15000;
				sub = afterConvert - CashLimit;
				if (afterConvert > CashLimit) {
					System.out.printf(
							"Sorry, that's more than the allowed amount (%,d %s) by %.2f\n" ,
							CashLimit, desiredCurrency, sub);
					continue;
				}
				break;
			case "GBP":
				afterConvert = amount / 3.98;
				CashLimit = 20000;
				sub = afterConvert - CashLimit;
				if (afterConvert > CashLimit) {
					System.out.printf(
							"Sorry, that's more than the allowed amount (%,d %s) by %.2f\n" ,
							CashLimit, desiredCurrency, sub);
					continue;
				}
				break;
			case "CAD":
				afterConvert = amount / 2.79;
				CashLimit = 25000;
				sub = afterConvert - CashLimit;
				if (afterConvert > CashLimit) {
					System.out.printf(
							"Sorry, that's more than the allowed amount (%,d %s) by %.2f\n" ,
							CashLimit, desiredCurrency, sub);
					continue;
				}
				break;
			}
			System.out.printf("The amount %.2f is within the limits (%,d %s).\n", afterConvert, CashLimit, desiredCurrency);
		} while (true);
	}

}
