package ghazi;

import java.util.Scanner;

//Import Scanner Class
class UnitConverter { // class's name is UnitConverter
	static Scanner input = new Scanner(System.in);
	// Create a Scanner object named 'input' to handle user input

	public static void main(String[] args) {
		System.out.print("Enter the unit (m_ft, L_gal, SAR_USD): ");
		String unit = input.next();
		if (!unit.equalsIgnoreCase("m_ft") && !unit.equalsIgnoreCase("L_gal") && !unit.equalsIgnoreCase("SAR_USD")) {
			System.out.println("Invalid operation");
			return;
		} // Validate the entered unit; if unsupported, stop the program

		System.out.print("Enter two numbers separate by spaces: "); // Prompt the user to enter two numeric values
																	// separated by spaces
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		// Declare The Needed Variables
		if (unit.equalsIgnoreCase("m_ft")) {
			secondNumber = secondNumber * 0.3048; // made the secondNumber in meters so the conversion would be accurate

			if (Math.abs(firstNumber - secondNumber) < 0.0001)
				System.out.printf("%.4f m is equal to %.1f ft\n", firstNumber, firstNumber * 3.28084);

			else if (firstNumber > secondNumber)
				System.out.printf("%.4f m is greater than %.4f m\n", firstNumber, secondNumber);
			else
				System.out.printf("%.1f ft is greater than %.1f ft\n", secondNumber * 3.28084, firstNumber * 3.28084);

			// Compare and display the relationship between the two values in meters and
			// feet
		} else if (unit.equalsIgnoreCase("L_gal")) {
			double secondToLiters = secondNumber * 3.78541; // made the secondNumber in liters so the conversion would
															// be accurate
			if (Math.abs(firstNumber - secondToLiters) < 0.0001)
				System.out.printf("%.1f L is equal to %.1f gal%n", firstNumber, secondNumber);

			else if (firstNumber > secondToLiters)
				System.out.printf("%.1f L is greater than %.6f L%n", firstNumber, secondToLiters);

			else
				System.out.printf("%.1f gal is greater than %.6f gal%n", secondNumber, firstNumber * 0.264172);

			// Compare and display the relationship between the two values in liters and
			// gallons
		} else if (unit.equalsIgnoreCase("SAR_USD")) {
			double secondToSar= secondNumber*3.75; // made the secondNumber in SAR so the conversion on would be accurate
			if (Math.abs(firstNumber - secondToSar) < 0.0001)
				System.out.printf("%.1f SAR is equal to %.1f USD\n", firstNumber, secondNumber);

			else if (firstNumber > secondToSar)
				System.out.printf("%.1f SAR is greater than %.2f SAR\n", firstNumber , secondToSar);

			else
				System.out.printf("%.1f USD is greater than %.2f USD\n", secondNumber , firstNumber * 0.2667); 

		} // Compare and display the relationship between the two values in SAR and USD

	} // end main

} // end class
