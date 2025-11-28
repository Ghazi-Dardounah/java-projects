package ghazi;

import java.util.Scanner;

class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Mathematical operations calculation program!!\n");
		System.out.print("Enter two numbers with SPACES:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.print("choose an operation: (*,+,-,/): ");
		String op = input.next();
		if ("*".equals(op)) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if ("+".equals(op)) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if ("-".equals(op)) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if ("/".equals(op)) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
	}

}