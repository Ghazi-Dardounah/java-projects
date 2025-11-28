package gt;
import java.util.Scanner;
class Employee {
	private String name;
	private int hours;
	private double salary;
	
	public void setSalary(double s) {
		if(s < 0) {
			System.out.println("Invalid Salary");
		}
		else {
			salary = s;
		}
	}
	public void setHours(int h) {
		if(h<0) {
			System.out.println("Invalid Hours");
		}
		else {
			hours = h ;
		}
	}
	public void userInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = input.nextLine();
		System.out.println("Enter the number of hours: ");
		int x = input.nextInt();
		setHours(x);
		System.out.println("Enter the base Salary: ");
		double s = input.nextDouble();
		setSalary(s);
	}
	public double calcMonthlySalary() {
		if (hours > 160) {
			return this.salary +50 *(hours-160);
		}
		else {
			return this.salary; 
		}
	}
	public void displayInfo() {
		System.out.println("Name: "+ name);
		System.out.println("number of hours: "+hours);
		System.out.println("the base Salary: " + salary);
		System.out.println("Monthly Salary: " + this.calcMonthlySalary());
	}
	public static void main(String[] args) {
		Employee j = new Employee();
		j.userInput();
		j.displayInfo();
	}
}
