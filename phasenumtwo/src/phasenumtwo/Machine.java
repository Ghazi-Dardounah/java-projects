package phasenumtwo;

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

	public Machine(Machine m) {
		this.name = m.name;
		this.id = m.id;
	}

	@Override
	public boolean isValid() {
		if (id == null || id.length() < 3) {
			return false;
		}
		if (name == null || name.isEmpty()) {
			return false;
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}
