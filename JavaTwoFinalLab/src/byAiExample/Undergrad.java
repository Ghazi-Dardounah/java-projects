package byAiExample;

public class Undergrad extends Student {
	private int level;
	private boolean scholarship;

	public Undergrad(String name, String id, int studyHours, int level, boolean scholarship) {
		super(name, id, studyHours);
		this.level = level;
		this.scholarship = scholarship;
	}

	public void registerCourse() {
		System.out.println("Registered undergrad: " + name);
	}
	public double calculateTuition() {
		if(scholarship)
			return studyHours*50;
		return studyHours*100;
	}
	public String toString() {
		return "Undergrad: " + name + " (" + id + ") " + "[level " + level + "] " + "(" + studyHours + ")"; 
	}


}
