package ksa;
import java.util.Scanner;
class Employee {
	private String name;
	private int id;
	private int hours;
	private double rate;
	
	public Employee() {}
	public Employee(String n , int i , int h ,double r) {
		this.name = n;
		this.id = i;
		this.hours = h;
		this.rate = r;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setId(int i) {
		this.id = i; 
	}
	public void setHours(int h) {
		if(h<0) {
			System.out.println("Error: hours can not be negative!");
			System.exit(0);
		}
		else {
			this.hours = h;
		}
	}
	public void setRate(double r) {
		if(r <=0) {
			System.out.println("Error: There is no such a rate!");
			System.exit(0);
		}
		else {
			this.rate = r;
		}
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public int getHours () {
		return hours;
	}
	public double getRate() {
		return rate;
	}
	public double calcSalary() {
		if(hours <=160) {
			return hours*rate;
		}
		else {
			return 160*rate + (hours - 160)*rate *1.5;
		}
	}
	public boolean hasOverTime() {
		if(hours > 160) {
			System.out.println("The Employee Has Over Time.");
			return true;
		}
		else {
			System.out.println("dose not has over time.");
			return false;
		}
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Employee e = new Employee(); 
    	System.out.println("Enter your name: ");
    	e.setName(input.nextLine());
		System.out.println("Enter your id: ");
		e.setId(input.nextInt());
		input.nextLine();
		System.out.println("Enter the working hours: ");
		e.setHours(input.nextInt());
		System.out.println("Enter The rate: ");
		e.setRate(input.nextDouble());
		System.out.println("Name: " + e.getName());
		System.out.println("Total salary: "+ e.calcSalary());
		e.hasOverTime();
	}
	
			
}
