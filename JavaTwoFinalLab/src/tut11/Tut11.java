package tut11;

import java.util.*;
import java.io.*;

public class Tut11 {
	public static void main(String args[]) throws IOException {
		//======================================== Q2 ===================================================
//		File file = new File("students.txt");
//		File file2 = new File("graduate.dat");
//		File file3 = new File("Undergraduate.dat");
//		Scanner scanner = new Scanner(new FileInputStream(file));
//		ObjectOutputStream obu1 = new ObjectOutputStream(new FileOutputStream(file2));
//		ObjectOutputStream obu2 = new ObjectOutputStream(new FileOutputStream(file3));
//		while (scanner.hasNext()) {
//			if(scanner.hasNextDouble())
//				break; 
//			String name = scanner.next();
//			String type = scanner.next();
//			double gpa = scanner.nextDouble();
//			if (type.equals("Graduate")) {
//				obu1.writeUTF(name);
//				obu1.writeUTF(type);
//				obu1.writeDouble(gpa);
//			} else if (type.equals("Undergraduate")) {
//				obu2.writeUTF(name);
//				obu2.writeUTF(type);
//				obu2.writeDouble(gpa);
//			}
//		}
//		obu1.close();
//		obu2.close();
//		scanner.close();
//      ============================== Q1 =========================================================
//		File file = new File("C:\\Users\\gbass\\eclipse-workspace\\JavaTwoFinalLab\\CSV..txt");
//		File anotherFile = new File("another.txt");
//		PrintWriter PR = new PrintWriter(new FileOutputStream(anotherFile, true));
//		Scanner scanner = new Scanner(file);
//		scanner.useDelimiter(",");
//		while (scanner.hasNext()) {
//			int value = scanner.nextInt(); 
//			PR.println(value);
//		}
//		scanner.close();
//		PR.close();
	}

}
