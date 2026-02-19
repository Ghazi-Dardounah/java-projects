package labfour;

public class AdvancedCounter extends Counter {
	private int amount;

	public AdvancedCounter(int count, int amount) {
		super(count);
		this.amount = amount;
	}

	public void increment() {
		count += amount;
	}

	public String toString() {
		return super.toString() + " Type: Advanced, Amount: " + amount;
	}

}
