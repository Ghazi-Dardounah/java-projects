package gpt;

import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car c1 = new Car("Supra", "TOYOTA", 2002, 3.0, 85000);
		Car c2 = new Car();
		System.out.print("Enter model: ");
		String model = input.next();
		c2.setModel(model);
		System.out.print("Enter brand: ");
		String brand = input.next().toUpperCase();
		c2.setBrand(brand);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		c2.setYear(year);
		System.out.print("Enter engine size: ");
		double eng = input.nextDouble();
		c2.setEngineSize(eng);
		System.out.print("Enter price: ");
		double price = input.nextDouble();
		c2.setPrice(price);
		c1.display();
		c2.display();
		System.out.print("Are the both cars equal? " + c1.equals(c2) + "\n");
		if (c1.getPrice() > c2.getPrice()) {
			System.out.println(c1.getModel() + " is more expensive than " + c2.getModel());
		} else if (c2.getPrice() > c1.getPrice()) {
			System.out.println(c2.getModel() + " is more expensive than " + c1.getModel());
		} else {
			System.out.println("Both have the same price.");
		}
		System.out.println("Number of cars: " +Car.getCountCars());
		input.close();

	}

}
