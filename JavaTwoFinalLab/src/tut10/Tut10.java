package tut10;

import java.util.*;
import java.io.*;

public class Tut10 {

	public static void main(String[] args) throws IOException {
//      ======================= Q3 ===============================
		/*
		 * public void loadATm(String fname) throws IOException{
		 * File file = new File(fname);
		 * DataInputStream din = new DataInputSteam(new FileInputStream(file));
		 * int numberOfLines = din.readInt();
		 * for(int i = 0 ; i<numberOfLines ; i++){
		 * int id = din.readInt();
		 * String s = din.readUTF();
		 * boolean b = din.readBoolean();
		 * ATM a = new ATM(id,location,active);
		 * addAtm(a);
		 * }
		 * }
		 */
//      ======================= Q2 ===============================
//		File file = new File("image.jpg");
//		FileInputStream fin = new FileInputStream(file);
//		File file2 = new File("copy.jpg");
//		FileOutputStream fout = new FileOutputStream(file2);
//		byte[] array = new byte[(int) file.length()];
//		fin.read(array);
//		fin.close();
//		fout.write(array);
//		fout.close();
//      ======================= Q1 ================================
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter the file path: ");
//		String filePath = input.nextLine();
//		File path = new File(filePath);
//		if (path.isDirectory()) {
//			File array[] = path.listFiles();
//			for (int i = 0; i < array.length; i++) {
//				System.out.println(array[i]);
//			}
//		} else if (path.isFile()) {
//			System.out.println("Can read?: " + path.canRead());
//			System.out.println("Can write?: " + path.canWrite());
//			if (path.canRead() && path.canWrite())
//				System.out.println("It can both Read & Write.");
//		}
	}

}
