package ksuuu;

import java.util.Scanner; //import Scanner Library.

public class FlightTicketDemo {
	public boolean isValidClassType(char type) {
		if (type == 'f' || type == 'F' || type == 'b' || type == 'B' || type == 'E' || type == 'e') {
			return true;
		} else {
			return false;
		}

	}

	// Main method for running the program and handling user input.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FlightTicketDemo demo = new FlightTicketDemo();

		// Start loop to repeat the process until the user types 'exit'
		while (true) {
			System.out.print("Enter passenger name (or ‘exit’ to quit): ");
			String name = input.nextLine();
			// Check for exit command.
			if (name.equalsIgnoreCase("exit")) {
				System.exit(0);
			}
			char classType;
			boolean valid;

			// Loop to ensure the class type input is valid ('E', 'B', or 'F').
			do {
				System.out.print("Enter ticket class ('E', 'B', 'F'): ");
				String type = input.next().toUpperCase();
				classType = type.charAt(0);
				valid = demo.isValidClassType(classType);
				if (!valid) {
					System.out.println("Invalid class type! Please enter (E, B, or F).");
					continue;
				}
			} while (!valid);
			System.out.print("Enter days before flight: ");
			int daysBeforeFlight = input.nextInt();
			input.nextLine();
			FlightTicket t = new FlightTicket(name, classType, daysBeforeFlight);
			System.out.println(t.toString()); // Print all ticket information using toString().
		}
	}
}
