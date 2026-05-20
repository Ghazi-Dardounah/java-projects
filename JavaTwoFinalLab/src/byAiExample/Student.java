package byAiExample;

public abstract class Student implements Registrable {
	protected String name;
	protected String id;
	protected int studyHours;

	public Student(String name, String id, int studyHours) {
		this.name = name;
		this.id = id;
		this.studyHours = studyHours;
	}

	public int getStudyHours() {
		return studyHours;
	}

	public abstract double calculateTuition();

	public boolean equals(Student s) {
		if (this.id.equals(s.id))
			return true;
		return false;
	}

	public String toString() {
		return name + " (" + id + ") (" + studyHours + ") hours";
	}

}
