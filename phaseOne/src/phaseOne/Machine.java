package phaseOne;

/**
 * Represents gym equipment with validation rules.
 */
public class Machine implements ValidConditions {
	private String name;
	private String id;

	public Machine(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// Copy constructor for data security
	public Machine(Machine m) {
		this.name = m.name;
		this.id = m.id;
	}

	// Validates machine ID length and name existence
	@Override
	public boolean isValid() {
		if (id.length() < 3)
			return false;
		if (name.isEmpty())
			return false;
		return true;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}