package phasenumtwo;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Gym beStrong = new BeStrong("Be Strong", 50, 35);
		Gym fitTime = new FitTime("Fit Time", 50, 35);

		boolean running = true;

		while (running) {
			try {
				System.out.println("\n========== Welcome to the Subscription System ==========");
				System.out.println("1- Join a gym");
				System.out.println("2- Cancel membership");
				System.out.println("3- Add machine request");
				System.out.println("4- Apply as a coach");
				System.out.println("5- Show number of members");
				System.out.println("6- Search for a member");
				System.out.println("7- Show saved members from file");
				System.out.println("8- GUI: Add member");
				System.out.println("9- GUI: Show saved members");
				System.out.println("10- Exit");
				System.out.print("Your choice: ");

				int choice = input.nextInt();
				input.nextLine();

				switch (choice) {
				case 1:
					Gym gym1 = chooseGym(input, beStrong, fitTime);
					if (gym1 != null) {
						joinGym(input, gym1);
					}
					break;

				case 2:
					Gym gym2 = chooseGym(input, beStrong, fitTime);
					if (gym2 != null) {
						cancelMembership(input, gym2);
					}
					break;

				case 3:
					Gym gym3 = chooseGym(input, beStrong, fitTime);
					if (gym3 != null) {
						addMachineRequest(input, gym3);
					}
					break;

				case 4:
					Gym gym4 = chooseGym(input, beStrong, fitTime);
					if (gym4 != null) {
						applyAsCoach(input, gym4);
					}
					break;

				case 5:
					showMembersCount(beStrong, fitTime);
					break;

				case 6:
					Gym gym5 = chooseGym(input, beStrong, fitTime);
					if (gym5 != null) {
						searchMember(input, gym5);
					}
					break;

				case 7:
					showSavedMembers();
					break;

				case 8:
					Gym gym6 = chooseGym(input, beStrong, fitTime);
					if (gym6 != null) {
						new AddMemberFrame(gym6);
					}
					break;

				case 9:
					new ShowMembersFrame();
					break;

				case 10:
					running = false;
					System.out.println("Thank you for using the system.");
					break;

				default:
					System.out.println("Invalid choice.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input type. Please enter a number.");
				input.nextLine();
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}

		input.close();
	}

	public static Gym chooseGym(Scanner input, Gym beStrong, Gym fitTime) {
		System.out.println("\nChoose a gym:");
		System.out.println("1- Be Strong");
		System.out.println("2- Fit Time");
		System.out.print("Your choice: ");

		int gymChoice = input.nextInt();
		input.nextLine();

		switch (gymChoice) {
		case 1:
			return beStrong;
		case 2:
			return fitTime;
		default:
			System.out.println("Invalid gym choice.");
			return null;
		}
	}

	public static void joinGym(Scanner input, Gym gym) {
		System.out.print("\nEnter your full name: ");
		String name = input.nextLine();

		System.out.print("Enter your age: ");
		int age = input.nextInt();
		input.nextLine();

		System.out.print("Enter your ID: ");
		String id = input.nextLine();

		System.out.print("Enter your gender: ");
		String gender = input.nextLine();

		System.out.print("Enter your height in meters: ");
		double height = input.nextDouble();

		System.out.print("Enter your weight: ");
		double weight = input.nextDouble();
		input.nextLine();

		Person person = new BodyBuilder(name, age, id, gender, height, weight);

		if (person.isAdult() && person.isMale()) {
			if (gym.addPerson(person)) {
				BodyBuilder bodyBuilder = (BodyBuilder) person;

				System.out.println("\nYou have successfully subscribed to " + gym.getName());
				System.out.println(person);
				System.out.println("BMI: " + bodyBuilder.calculateBmi());

				try {
					FileManager.savePersonsInfo(person, gym.getName());
				} catch (IOException e) {
					System.out.println("Error saving member data to file.");
				}

				int months = choosePlan(input);
				if (months > 0) {
					System.out.println("Total price: " + (months * gym.calculatePrice()));
				}
			}
		} else {
			System.out.println("Sorry, you do not meet the requirements.");
		}
	}

	public static int choosePlan(Scanner input) {
		System.out.println("\nChoose your plan:");
		System.out.println("1- One month");
		System.out.println("2- Three months");
		System.out.println("3- One year");
		System.out.print("Your choice: ");

		int plan = input.nextInt();
		input.nextLine();

		switch (plan) {
		case 1:
			return 1;
		case 2:
			return 3;
		case 3:
			return 12;
		default:
			System.out.println("Invalid plan choice.");
			return 0;
		}
	}

	public static void cancelMembership(Scanner input, Gym gym) {
		System.out.print("\nEnter your ID: ");
		String id = input.nextLine();

		if (gym.removePerson(id)) {
			System.out.println("Your membership was canceled successfully.");
		} else {
			System.out.println("Sorry, there is no member with this ID.");
		}
	}

	public static void addMachineRequest(Scanner input, Gym gym) {
		System.out.print("\nEnter machine name: ");
		String machineName = input.nextLine();

		System.out.print("Enter machine ID: ");
		String machineId = input.nextLine();

		Machine machine = new Machine(machineName, machineId);

		if (machine.isValid()) {
			if (gym.addMachine(machine)) {
				System.out.println("Thanks a lot, we will see about your request.");
			} else {
				System.out.println("Sorry, Gym is Full!");
			}
		} else {
			System.out.println("Machine request rejected.");
		}
	}

	public static void applyAsCoach(Scanner input, Gym gym) {
		Coach coach = new Coach();
		coach.applyForJob(input);

		if (coach.isValid()) {
			if (gym.addPerson(coach)) {
				System.out.println("Welcome to " + gym.getName() + " as a coach.");
			} else {
				System.out.println("Sorry, Gym is Full!");
			}
		} else {
			System.out.println("Sorry, you do not meet the coach requirements.");
		}
	}

	public static void showMembersCount(Gym beStrong, Gym fitTime) {
		System.out.println("\n===== Members Count =====");
		System.out.println("Be Strong members: " + beStrong.countPersons());
		System.out.println("Fit Time members: " + fitTime.countPersons());
		System.out.println("Total members: " + (beStrong.countPersons() + fitTime.countPersons()));
	}

	public static void searchMember(Scanner input, Gym gym) {
		System.out.print("\nEnter member ID: ");
		String id = input.nextLine();

		Person person = gym.searchPersonById(id);

		if (person != null) {
			System.out.println("Member found:");
			System.out.println(person);
		} else {
			System.out.println("No member found with this ID.");
		}
	}

	public static void showSavedMembers() {
		System.out.println("\n============================= Saved Members =============================");
		try {
			FileManager.printPersonsInfo();
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
