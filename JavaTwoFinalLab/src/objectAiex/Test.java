package objectAiex;
import java.io.*;
public class Test {
	public static void main(String args[]) throws IOException,ClassNotFoundException {
		Student students[] = new Student[3];
		students[0] = new Student(1234,"Ahmed",4.9);
		students[1] = new Student(1234,"Abduallah",4.4);
		students[2] = new Student(1234,"khalid",5);
		File file = new File("students.txt");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream ot = new ObjectOutputStream(fout); 
		ot.writeObject(students);
		ot.close();
		FileInputStream fint = new FileInputStream(file);
		ObjectInputStream ob = new ObjectInputStream(fint); 
		Student[] is = (Student[]) ob.readObject();
		for(int i = 0 ; i<students.length ; i++) {
			System.out.println(is[i].toString());
		}
	}

}
