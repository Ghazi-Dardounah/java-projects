package phaseOne;

/**
 * Abstract class representing a general Gym structure.
 */
public abstract class Gym {
	protected String name;
	private Machine[] machines; // Composition relationship with Machine
	private int numOfMachines;
	private Person[] persons; // Aggregation relationship with Person
	private int numOfPersons;

	// Constructor to initialize gym name and array capacities
	public Gym(String name, int personsSize, int machinesSize) {
		this.name = name;
		persons = new Person[personsSize];
		machines = new Machine[machinesSize];
		numOfMachines = 0;
		numOfPersons = 0;
	}

	// Adds a person to the gym if there is available space
	public boolean addPerson(Person p) {
		if (numOfPersons < persons.length) {
			persons[numOfPersons++] = p;
			return true;
		}
		System.out.println("Sorry, Gym is Full!");
		return false;
	}

	// Adds a machine by creating a copy to ensure data integrity
	public boolean addMachine(Machine m) {
		if (numOfMachines < machines.length) {
			machines[numOfMachines++] = new Machine(m);
			return true;
		}
		return false;
	}

	// Abstract method to be implemented by specific gym branches
	public abstract double calculatePrice();

	// Search for a person by ID
	public Person searchPersonById(String id) {
		for (int i = 0; i < numOfPersons; i++) {
			if (persons[i].getId().equals(id)) {
				return persons[i];
			}
		}
		return null;
	}

	// Removes a person by ID
	public boolean removePerson(String id) {
		int index = -1;

		for (int i = 0; i < numOfPersons; i++) {
			if (persons[i].getId().equals(id)) {
				index = i;
				break;
			}
		}

		if (index == -1)
			return false;

		for (int i = index; i < numOfPersons - 1; i++) {
			persons[i] = persons[i + 1];
		}

		persons[numOfPersons - 1] = null;
		numOfPersons--;
		return true;
	}

	// Wrapper method to start recursive counting
	public int countPersons() {
		return countPersonsRecursive(0);
	}

	// Recursive method to count the total number of members
	private int countPersonsRecursive(int index) {
		if (index >= numOfPersons)
			return 0;

		return 1 + countPersonsRecursive(index + 1);
	}
}