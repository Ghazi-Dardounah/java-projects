package objectAiex;

import java.io.*;

public class Student implements Serializable {
	private int id;
	private String name;
	private double gpa;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public String toString() {
		return "Name: " + name + "\n" + "Id: " + id + "\n" + "Gpa: " + gpa;
	}

}
