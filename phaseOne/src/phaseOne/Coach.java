package phaseOne;

import java.util.*;

/**
 * Represents a professional trainer with specific job requirements.
 */
public class Coach extends BodyBuilder implements ValidConditions {
	private int yearsBeenWorking;
	private double bodyFat;

	public Coach() {
		super("null", 0, "null", "null", 0, 0);
		this.yearsBeenWorking = 0;
		this.bodyFat = 0;
	}

	// Interactively collects application data from the user
	public void applyForJob() {
		Scanner input = new Scanner(System.in);
		System.out.println("==================== Job Aplecation ====================");
		System.out.println("Enter your name: ");
		name = input.nextLine();
		System.out.println("How many years of experience do you have?: ");
		yearsBeenWorking = input.nextInt();
		System.out.println("Enter your id: ");
		id = input.next();
		System.out.println("Enter gender(Male/Female): ");
		gender = input.next();
		System.out.println("Enter your age: ");
		age = input.nextInt();
		System.out.println("Enter your weight: ");
		weight = input.nextDouble();
		System.out.println("Enter your height in meters: ");
		height = input.nextDouble();
		System.out.println("Enter your body fat percent: ");
		bodyFat = input.nextDouble();
	}

	// Validates if the coach meets hiring criteria
	@Override
	public boolean isValid() {
		if (age > 38 || age < 24)
			return false;
		if (yearsBeenWorking < 3)
			return false;
		if (!gender.equalsIgnoreCase("male"))
			return false;
		if (bodyFat > 15)
			return false;
		if (calculateBmi() > 28)
			return false;
		return true;
	}
}