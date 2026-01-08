package finalExmasss;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.print("Please enter s2 id, name, age, and gpa: ");
		int id = input.nextInt();
		s2.setId(id);
		String name = input.next();
		s2.setName(name);
		int age = input.nextInt();
		s2.setAge(age);
		double gpa = input.nextDouble();
		s2.setGpa(gpa);
		while (true) {
			System.out.println("-----------------");
			System.out.print("1- Display s1 and s2 Information");
			System.out.print("\t");
			System.out.println("\t2- Edit s1 Information");
			System.out.print("3- Compare s1 to s2");
			System.out.print("\t");
			System.out.println("\t4- Compare s2 to s1");
			System.out.println("5- Exit");
			System.out.println("-----------------");
			System.out.println("Enter your option: ");
			int option = input.nextInt();
			if (option == 5) {
				System.out.println("Thanks! Goodbye");
				System.exit(0);
			}
			switch (option) {
			case 1:
				s1.display();
				s2.display();
				break;
			case 2:
				System.out.print("Please enter s1 new id, name, age, and gpa: ");
				id = input.nextInt();
				s1.setId(id);
				name = input.next();
				s1.setName(name);
				age = input.nextInt();
				s1.setAge(age);
				gpa = input.nextDouble();
				s1.setGpa(gpa);
				s1.display();
				break;
			case 3:
				if (s1.compare(s2) == 1) {
					System.out.println("s1 GPA is greater than s2 gpa");
				} else if (s1.compare(s2) == 0) {
					System.out.println("s1 GPA is equal to s2 gpa");
				} else if (s1.compare(s2) == -1) {
					System.out.println("s1 GPA is less than s2 gpa");
				}
				break;
			case 4:
				if (s2.compare(s1) == 1) {
					System.out.println("s2 GPA is greater than s1 gpa");
				} else if (s2.compare(s1) == 0) {
					System.out.println("s2 GPA is equal to s1 gpa");
				} else if (s2.compare(s1) == -1) {
					System.out.println("s2 GPA is less than s1 gpa");
				}
				break;
			default:
				System.out.println("Wrong input, try again!");
				continue;
			}

		}

	}

}
