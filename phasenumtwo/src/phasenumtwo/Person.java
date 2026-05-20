package phasenumtwo;

/**
 * Base class representing an individual in the system.
 */
public class Person {
	protected String name;
	protected int age;
	protected String id;
	protected String gender;

	public Person(String name, int age, String id, String gender) {
		if (age < 0) {
			throw new InvalidAgeException("Age cannot be negative.");
		}

		this.name = name;
		this.age = age;
		this.id = id;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new InvalidAgeException("Age cannot be negative.");
		}
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isAdult() {
		return age >= 17;
	}

	public boolean isMale() {
		return gender != null && gender.equalsIgnoreCase("male");
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", ID: " + id + ", Gender: " + gender;
	}
}
