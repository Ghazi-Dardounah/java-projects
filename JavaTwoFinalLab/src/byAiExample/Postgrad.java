package byAiExample;

public class Postgrad extends Student {
	private String researchTopic;

	public Postgrad(String name, String id, int studyHours, String researchTopic) {
		super(name, id, studyHours);
		this.researchTopic = researchTopic;
	}

	public void registerCourse() {
		System.out.println("Registered postgrad: " + name + " in " + researchTopic);
	}

	public double calculateTuition() {
		return studyHours * 200;
	}

	public String toString() {
		return "Postgrad: " + name + " (" + id + ") [" + researchTopic + "] [" + studyHours + " hours]";
	}

}
