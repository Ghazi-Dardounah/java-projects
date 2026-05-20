package phaseOne;

public class BeStrong extends Gym {
	public BeStrong(String name, int numOfPersons, int numOfMachines) {
		super(name, numOfPersons, numOfMachines);
	}

	@Override
	public double calculatePrice() {
		return 200;
	} // Monthly rate for BeStrong
}