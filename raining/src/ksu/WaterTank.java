package ksu;

import java.util.Scanner;

class WaterTank {
	private double capacity;
	private double currentLevel;

	public WaterTank(double capacity, double currentLevel) {
		this.capacity = capacity;
		this.currentLevel = currentLevel;
	}

	public void setCapacity(double c) {
		this.capacity = c;
	}

	public double getCapacity() {
		return capacity;
	}

	public void fill(double amount) {
		if (amount < 0) {
			System.out.println("Invalid!");
			return;
		}
		if (amount + currentLevel > capacity) {
			currentLevel = capacity;
		} else {
			currentLevel += amount;
		}
	}

	public void setCurrentLevel(double cl) {
		currentLevel = cl;
	}

	double getCurrentLevel() {
		return currentLevel;
	}

	public boolean drain(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount!");
			return false;
		}
		if (amount > currentLevel) {
			System.out.println("Not Enough Water!");
			return false;
		} else {
			currentLevel -= amount;
			return true;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the capacity: ");
		int cap = input.nextInt();
		WaterTank g = new WaterTank(cap, 0);
		while (true) {
			System.out.println("choose your operation :\n1)Fill\n2)drain\n3)Show Level\n4)Exit");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Enter the amount: ");
				int amount = input.nextInt();
				g.fill(amount);
				break;
			case 2:
				System.out.println("Enter the amount: ");
				amount = input.nextInt();
				g.drain(amount);
				break;
			case 3:
				System.out.println("the current level is: " + g.getCurrentLevel());
				break;
			case 4:
				System.exit(0);

			}
		}
	}

}
