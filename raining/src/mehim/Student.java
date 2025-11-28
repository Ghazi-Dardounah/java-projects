package mehim;
import java.util.Scanner;
public class Student {
	private String name;
	private String id;
	private int grade;
	
	public void setGrade(int g) {
		if(g < 0 || g > 100 ) {
			System.out.println("Invalid grade!");
		}
		else {
			grade = g ; 
		}
	}
	
	
	
	public void userInput() {
		Scanner ghazi = new Scanner(System.in);
		System.out.println("Enter thr student id: ");
		id = ghazi.next();
		System.out.println("Enter the student name: ");
		ghazi.nextLine();
		name = ghazi.nextLine();
		System.out.println("Enter the grade: ");
		int x = ghazi.nextInt();
		setGrade(x);
	}
	public void displayinfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student id: " + id);
		System.out.println("Student grade: "+ grade);
		
	}
	public static void main(String args[]) {
		Student b = new Student();
		b.userInput();
		b.displayinfo();
		if (b.grade >= 60 ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
