package lab10;

public class Staff {
	private String name;
	private int ID;
	private double salary;
	private int hours;
	public Staff(String n, int id, double s, int h) throws InvalidHoursException {
	    name = n;
		ID = id;
		salary = s;
		setHours(h);
	}
	public void setHours(int hours) throws InvalidHoursException {
		if(hours>7 && hours<12) {
			this.hours = hours;
		}
		else {
			throw new InvalidHoursException("Sorry, Invalid number of hours,"
					+ "please enter a valid number between 7 and 12.");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name: " + name +"\nID: "+ID+"\nsalary: "+salary+"\nhours: "+hours;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
	public int getHours() {
		return hours;
	}

}
