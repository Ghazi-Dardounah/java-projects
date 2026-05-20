package phasenumtwo;

/**
 * Abstract class representing a general Gym structure. Phase 2 version uses
 * linked lists instead of arrays.
 */
public abstract class Gym {
	protected String name;
	private LinkedList<Machine> machines;
	private LinkedList<Person> persons;
	private int maxPersons;
	private int maxMachines;

	public Gym(String name, int maxPersons, int maxMachines) {
		this.name = name;
		this.maxPersons = maxPersons;
		this.maxMachines = maxMachines;
		machines = new LinkedList<Machine>();
		persons = new LinkedList<Person>();
	}

	public String getName() {
		return name;
	}

	public boolean addPerson(Person p) {
		if (persons.size() < maxPersons) {
			persons.add(p);
			return true;
		}
		System.out.println("Sorry, Gym is Full!");
		return false;
	}

	public boolean addMachine(Machine m) {
		if (machines.size() < maxMachines) {
			machines.add(new Machine(m));
			return true;
		}
		return false;
	}

	public abstract double calculatePrice();

	public Person searchPersonById(String id) {
		return persons.search(p -> p.getId().equals(id));
	}

	public boolean removePerson(String id) {
		Person found = searchPersonById(id);
		if (found == null) {
			return false;
		}
		return persons.remove(found);
	}

	public int countPersons() {
		return countPersonsRecursive(persons.getHead());
	}

	private int countPersonsRecursive(Node<Person> current) {
		if (current == null) {
			return 0;
		}
		return 1 + countPersonsRecursive(current.next);
	}

	public String getMembersAsText() {
		if (persons.isEmpty()) {
			return "No members found in " + name + ".";
		}

		String result = "Members in " + name + ":\n";

		for (Person p : persons) {
			result += p.toString() + "\n";
		}

		return result;
	}
}
