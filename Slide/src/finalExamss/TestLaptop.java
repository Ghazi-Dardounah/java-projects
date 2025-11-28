package finalExamss;

import java.util.Scanner;

class TestLaptop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Laptop laptop1 = new Laptop("KSU_Laptop", "INTEL", 16, 512, 14.2, 1.33);
		Laptop laptop2 = new Laptop();
		System.out.print("Enter the laptop name: ");
		String name = input.next();
		laptop2.setName(name);
		System.out.print("Enter CPU (INTEL/AMD/OTHER): ");
		String cpu = input.next();
		laptop2.setCpu(cpu);
		System.out.print("Enter RAM (GB): ");
		int ram = input.nextInt();
		laptop2.setRam(ram);
		System.out.print("Enter storage (GB): ");
		int storage = input.nextInt();
		laptop2.setStorage(storage);
		System.out.print("Enter screen size (inch): ");
		double size = input.nextDouble();
		laptop2.setScreen(size);
		System.out.print("Enter weight (KG): ");
		double weight = input.nextDouble();
		laptop2.setWeight(weight);
		System.out.print("\n");
		laptop1.display();
		System.out.print("\n");
		laptop2.display();
		System.out.print("\n");
		System.out.print("Are the laptops equal? " + laptop1.equals(laptop2) + "\n");
		if (laptop1.calculatePrice() > laptop2.calculatePrice()) {
			System.out.println(laptop1.getName() + " is more expensive than " + laptop2.getName());
		} else if (laptop1.calculatePrice() < laptop2.calculatePrice()) {
			System.out.println(laptop2.getName() + " is more expensive than " + laptop1.getName());
		} else {
			System.out.println("The two laptops have the same price.");
		}
		input.close();
	}

}
