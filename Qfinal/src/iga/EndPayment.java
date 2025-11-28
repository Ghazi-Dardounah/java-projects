package iga;

import java.util.Scanner;

public class EndPayment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int employeeId;
		double salary;
		int timeOfService;
		double paymentService = 0;
		while (true) {
			System.out.print("Please enter the employee id " + "(-1 to exit) : ");
			employeeId = input.nextInt();
			if (employeeId == -1) {
				System.out.println("Thanks! Goodbye!");
				System.exit(0);
			}
			System.out.print("Please enter the salary: ");
			salary = input.nextDouble();
			System.out.println("Please enter the time " + "of service: ");
			timeOfService = input.nextInt();
			if (timeOfService > 0 && timeOfService <= 5) {
				paymentService = timeOfService * 0.1 * salary * 12;
			} else if (timeOfService >= 6 && timeOfService <= 10) {
				paymentService = 5 * 0.1 * salary * 12 + (timeOfService - 5) * 0.25 * salary * 12;
			} else if (timeOfService > 10) {
				paymentService = 5 * 0.1 * salary * 12 + 5 * 0.25 * salary * 12
						+ (timeOfService - 10) * 0.35 * salary * 12;
			}
			System.out.println("The total payment for employee with id number: "+ employeeId +" and who served "+timeOfService +" years is: "+paymentService+" SR" );
		}
	}

}
