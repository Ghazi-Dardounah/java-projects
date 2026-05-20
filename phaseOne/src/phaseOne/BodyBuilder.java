package phaseOne;

/**
 * Specialized class for members tracking physical attributes.
 */
public class BodyBuilder extends Person {
	protected double height;
	protected double weight;

	public BodyBuilder(String name, int age, String id, String gender, double height, double weight) {
		super(name, age, id, gender);
		this.height = height;
		this.weight = weight;
	}

	// Calculates Body Mass Index
	public double calculateBmi() {
		return weight / (height * height);
	}
}