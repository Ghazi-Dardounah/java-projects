package atm;

import java.util.Scanner;

class testAcoount {
	public static void main(String[] args) {
		Account account = new Account();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter account number, name, balance and type: ");
		account.setNumber(input.nextInt());
		account.setName(input.next());
		account.setBalance(input.nextDouble());
		account.setType(input.next());
		while (true) {
			System.out.println("Choose your transaction:\n1)Deposit\n2)withdraw\n3)Show balance\n4)Exit");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Enter the amount: ");
				double amount = input.nextDouble();
				account.deposit(amount);
				break;
			case 2:
				System.out.println("Enter the amount: ");
				amount = input.nextDouble();
				account.withdraw(amount);
				break;
			case 3:
				System.out.println("Account number: "+account.getNumber()+" For Mr."+account.getName()+" has balance of "+account.getBalance());
				break;
			case 4:
				System.out.println("Goodbye");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input try again");
				continue;
			}

		}
	}
}
