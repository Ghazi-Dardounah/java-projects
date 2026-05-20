package byAiExample;

public class University {
	private String name;
	private Registrable[] students;
	private int count;

	public University(String name, int size) throws IllegalArgumentException {
		if (size <= 0)
			throw new IllegalArgumentException("Invalid size: " + size);
		this.name = name;
		students = new Registrable[size];
		count = 0;
	}

	public boolean add(Registrable s) {
		for (int i = 0; i < count; i++) {
			if (((Student) students[i]).equals((Student) s)) {
				return false;
			}
			if (count < students.length) {
				students[count++] = (Student) s;
				return true;
			}
		}
		return false;
	}

	public boolean remove(Registrable s) {
		for (int i = 0; i < count; i++) {
			if (((Student) students[i]).equals((Student) s)) {
				for (int j = i; j < count - 1; j++) { 
					students[j] = students[j + 1];
				}
				students[count - 1] = null;  
				count--;
				return true;
			}
		}
		return false;
	}

	public void registerAll() {
		for (int i = 0; i < count; i++) {
			students[i].registerCourse();
		}
	}

	public Registrable getMaxHours() {
		if (count == 0)
			return null;
		return getMaxHoursHelper(0);
	}

	public Registrable getMaxHoursHelper(int i) {
		if (i == count - 1)
			return students[i];
		Registrable max = getMaxHoursHelper(i + 1);
		if (students[i].getStudyHours() > max.getStudyHours())
			return students[i]; 
		return max;
	}
	
	

}
