package phasenumtwo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Represents a professional trainer with specific job requirements.
 */
public class Coach extends BodyBuilder implements ValidConditions {
    private int yearsBeenWorking;
    private double bodyFat;

    public Coach() {
        super("null", 0, "null", "null", 0, 0);
        yearsBeenWorking = 0;
        bodyFat = 0;
    }

    public Coach(String name, int age, String id, String gender, double height, double weight,
                 int yearsBeenWorking, double bodyFat) {
        super(name, age, id, gender, height, weight);
        this.yearsBeenWorking = yearsBeenWorking;
        this.bodyFat = bodyFat;
    }

    public void applyForJob(Scanner input) {
        boolean validInput = false;

        System.out.println("==================== Job Application ====================");

        while (!validInput) {
            try {
                System.out.print("Enter your name: ");
                name = input.nextLine();

                System.out.print("How many years of experience do you have?: ");
                yearsBeenWorking = input.nextInt();
                input.nextLine();

                System.out.print("Enter your ID: ");
                id = input.nextLine();

                System.out.print("Enter gender (Male/Female): ");
                gender = input.nextLine();

                System.out.print("Enter your age: ");
                setAge(input.nextInt());
                input.nextLine();

                System.out.print("Enter your weight: ");
                weight = input.nextDouble();
                input.nextLine();

                System.out.print("Enter your height in meters: ");
                height = input.nextDouble();
                input.nextLine();

                System.out.print("Enter your body fat percent: ");
                bodyFat = input.nextDouble();
                input.nextLine();

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please enter numbers in numeric fields.");
                input.nextLine();
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public boolean isValid() {
        if (age > 38 || age < 24) {
            return false;
        }
        if (yearsBeenWorking < 3) {
            return false;
        }
        if (!isMale()) {
            return false;
        }
        if (bodyFat > 15) {
            return false;
        }
        if (calculateBmi() > 28) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", Years of Experience: " + yearsBeenWorking + ", Body Fat: " + bodyFat + "%";
    }
}
