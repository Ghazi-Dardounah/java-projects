package tut11;

import java.io.*;

public class Student implements Serializable {
	String name;
	String type;
	double gpa;

	public Student(String name, String type, double gpa) {
		this.name = name;
		this.type = type;
		this.gpa = gpa;
	}

	public String toString() {
		return "name: " + name + "\ntype: " + type + "\ngpa: " + gpa; 
	}
}
