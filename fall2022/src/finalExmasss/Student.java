package finalExmasss;

public class Student {
	private String name;
	private int id;
	private int age;
	private double gpa;

	public Student() {
		this.name = "NA";
		this.id = 123456;
		this.age = 20;
		this.gpa = 1;
	}

	public Student(String name, int id, int age, double gpa) {
		this.setName(name);
		this.setId(id);
		this.setAge(age);
		this.setGpa(gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (String.valueOf(id).length() == 6) {
			this.id = id;
		} else {
			System.out.println("Incorrect ID");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Incorrect age");
		}
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if (gpa >= 1 && gpa <= 5) {
			this.gpa = gpa;
		} else {
			System.out.println("Incorrect GPA");
		}

	}

	public void display() {
		System.out.println("ID: " + this.getId() + ", Name: " + this.getName() + ", Age: " + this.getAge() + ", Gpa: "
				+ this.getGpa() +" (" + this.getGrade() + ")" );
	}

	public String getGrade() {
		String grade = "";
		if (gpa >= 4.75 && gpa <= 5) {
			grade = "Excellent";
		} else if (gpa >= 4 && gpa < 4.75) {
			grade = "Very Good";
		} else if (gpa >= 3 && gpa < 4) {
			grade = "Good";
		} else if (gpa >= 2 && gpa < 3) {
			grade = "pass";
		} else {
			grade = "Fail";
		}
		return grade;
	}

	public int compare(Student stud) {
		int compare;
		if (this.gpa > stud.gpa) {
			compare = 1;
		} else if (this.gpa == stud.gpa) {
			compare = 0;
		} else {
			compare = -1;
		}
		return compare;
	}

}
