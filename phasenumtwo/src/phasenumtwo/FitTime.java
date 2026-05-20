package phasenumtwo;

public class FitTime extends Gym {
	public FitTime(String name, int numOfPersons, int numOfMachines) {
		super(name, numOfPersons, numOfMachines);
	}

	@Override
	public double calculatePrice() {
		return 300;
	} // Monthly rate for FitTime
}
