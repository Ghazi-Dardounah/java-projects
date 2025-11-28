package imn;
import java.util.Scanner;
class Student {
	private String name;
	private String id;
	private int grade;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setGrade(int g) {
		if(g>=0 && g<=100) {
			grade = g;
		}
		else {
			return;
		}
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getGrade() {
		return grade;
	}
	
	
	public boolean isPass() {
		if (this.grade >= 60 && this.grade<=100) {
			System.out.println("Pass");
			return true;
		}
		else {
			System.out.println("Fail");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter the student name: ");
		student.setName(input.nextLine());
		System.out.println("Enter the student id: ");
		student.setId(input.next());
		System.out.println("enter the student grade: ");
		input.nextLine();
		student.setGrade(input.nextInt());
		System.out.println("Studemt name is: "+student.getName());
		System.out.println("Studemt id is: "+student.getId());
		System.out.println("Student grade is "+student.getGrade());
		student.isPass();
		
		
		
	}

}
