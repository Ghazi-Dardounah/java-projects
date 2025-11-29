package csc111KSU;

import java.util.Scanner;

public class LeaveCalculator {

	public static void main(String[] args) {
		int numOfDays;
		int DaysAfterSub = 0;
		Scanner input = new Scanner(System.in);
		Employee employee = new Employee(0, 0, 21);
		System.out.print("Please enter Employee ID: ");
		employee.setId(input.nextInt());
		System.out.print("Please enter Hire Year (e.g., 2020): ");
		employee.setHireYear(input.nextInt());
		System.out.print("\n");
		boolean moreThanFive = employee.isOldEm();
		if (moreThanFive) {
			employee.setAnnualLeaveDays(30);
		}
		while (true) {
			System.out.println("--- Main Menu ---");
			System.out.println("1. Recuest Leave");
			System.out.println("2. Show Status");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter number of days for leave: ");
				numOfDays = input.nextInt();
				if (numOfDays <= employee.getAnnualLeaveDays()) {
					DaysAfterSub = employee.getAnnualLeaveDays() - numOfDays;
					employee.setAnnualLeaveDays(DaysAfterSub);
				} else {
					System.out.println("Error: Insufficient leave balance. Current balance is "
							+ employee.getAnnualLeaveDays() + " days.");
					continue;
				}
				System.out.println("Leave request successful. " + numOfDays + " days deducted.\n");
				break;
			case 2:
				System.out.println("Employee id: " + employee.getId());
				if (moreThanFive) {
					System.out.println("Time of Service: " + (2025 - employee.getHireYear()) + " years. "
							+ "(Eligible for 30 days annually).");
				} else {
					System.out.println("Time of Service: " + (2025 - employee.getHireYear()) + " years. "
							+ "(Eligible for 21 days annually).");
				}
				System.out.println("Remaining Annual Leave: " + employee.getAnnualLeaveDays() + " days.\n");
				break;
			case 3:
				System.out.println("Thank you. Goodbye!");
				System.exit(0);

			}
		}

	}

}
