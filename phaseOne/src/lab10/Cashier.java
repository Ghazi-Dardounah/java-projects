package lab10;

public class Cashier extends Staff {
	private int overtime;

	public Cashier(String n, int id, double s, int h, int overtime) throws InvalidHoursException {
		super(n, id, s, h);
		this.overtime = overtime;
	}
	public double getAllowance() {
		return getSalary()*overtime/(getHours()*100);
	}
	public String toString() {
		return super.toString()+"\nOvertime: "+overtime +"\nAllowance: "+getAllowance();
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public int getOvertime() {
		return overtime;
	}
}
