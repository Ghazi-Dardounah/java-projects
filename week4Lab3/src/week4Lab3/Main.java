package week4Lab3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Department finance = new Department("Finance", 10);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the employee number " + (i + 1) + " name: ");
			String name = input.next();
			System.out.println("Enter the employee number: " + (i + 1) + " id: ");
			String id = input.next();
			Employee emp = new Employee(id, name);
			finance.addEmployee(emp);
		}
		System.out.println(finance);
	}
}
