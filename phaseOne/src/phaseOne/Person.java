package phaseOne;

/**
 * Base class representing an individual in the system.
 */
public class Person {
	protected String name;
	protected int age;
	protected String id;
	protected String gender;

	public Person(String name, int age, String id, String gender) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.gender = gender;
	}

	// Standard Getters and Setters
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

	// Returns true if the person is 17 or older
	public boolean isAdult() {
		return getAge() >= 17;
	}

	// Checks if the gender is Male
	public boolean isMale() {
		return getGender().equalsIgnoreCase("Male");
	}

	// Returns formatted string of person details
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", ID: " + id + ", Gender: " + gender;
	}
}