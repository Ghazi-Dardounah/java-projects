package csc111KSU;

public class Employee {
	private int id;
	private int hireYear;
	private int annualLeaveDays;

	public Employee(int id, int hireYear, int annualLeaveDays) {
		this.id = id;
		this.hireYear = hireYear;
		this.annualLeaveDays = annualLeaveDays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public int getAnnualLeaveDays() {
		return annualLeaveDays;
	}

	public void setAnnualLeaveDays(int annualLeaveDays) {
		this.annualLeaveDays = annualLeaveDays;
	}
	public boolean isOldEm() {
		return 2025 - this.hireYear >= 5;
	}

}
