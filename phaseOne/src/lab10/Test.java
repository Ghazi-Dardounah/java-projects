package lab10;

import java.util.*;

public class Test {
	public static void main(String args[]) {
		Staff slist[] = new Cashier[3];
		Scanner input = new Scanner(System.in);
		try {
			for (int i = 0; i < 2; i++) {
				slist[i] = new Cashier("", 0, 0, 8, 0);
				System.out.println("========== Cashier number " + (i + 1) + " Informatios");
				System.out.println("Please Enter Your Name: ");
				slist[i].setName(input.next());
				System.out.println("Please Enter Your ID: ");
				slist[i].setID(input.nextInt());
				System.out.println("Please Enter Your salary: ");
				slist[i].setSalary(input.nextDouble());
				while (true) {
					try {
						System.out.println("Enter the number of hours: ");
						slist[i].setHours(input.nextInt());
						break;

					} catch (InvalidHoursException e) {
						System.out.println(e.getMessage());
						continue;
					}
				}
				System.out.println("Enter the overtime: ");
				((Cashier) slist[i]).setOvertime(input.nextInt());
				;
			}
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("========== Cashier number " + (i + 1) + " Informatios");
			System.out.println(slist[i]);
		}
	}
}
