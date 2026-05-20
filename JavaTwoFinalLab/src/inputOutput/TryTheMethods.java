package inputOutput;

import java.io.*;

public class TryTheMethods {
	public static void main(String[] args) throws IOException {
		File test = new File("C:\\Users\\gbass\\OneDrive\\Desktop\\csc113\\fileEx.txt");
		FileOutputStream out = new FileOutputStream(test);
		FileInputStream inp = new FileInputStream(test);
		DataOutputStream dout = new DataOutputStream(out);
		byte x = 1;
		int y = 2;
		char w = '3';
		dout.write(x);
		dout.writeInt(y);
		dout.writeChar(w);
		dout.close();
		DataInputStream dinp = new DataInputStream(inp);
		System.out.println(dinp.readByte());
		System.out.println(dinp.readInt());
		System.out.println(dinp.readChar());
		dinp.close();
//		PrintWriter pw = new PrintWriter(out);
		/*
		 * pw.println("ABCD"); pw.println("CSC"); pw.println(113); pw.close();
		 */
		/*
		 * Scanner reader = new Scanner(inp); reader.next(); reader.next();
		 * System.out.println(reader.nextInt());
		 */

		/*
		 * FileWriter fw = new FileWriter(test); BufferedWriter bw = new
		 * BufferedWriter(fw); bw.write(99); bw.write("cb"); bw.close();
		 * FileOutputStream out = new FileOutputStream(test); FileInputStream inp = new
		 * FileInputStream(test); PrintWriter p = new PrintWriter(out);
		 * p.println("My Name Is Ghazi Bassam ");
		 * p.print("Its my first String writing file"); p.close(); DataOutputStream dout
		 * = new DataOutputStream(out); DataInputStream input = new
		 * DataInputStream(inp); dout.writeInt(4); dout.writeBoolean(false);
		 * dout.writeInt(7); System.out.println(input.readInt());
		 * System.out.println(input.readBoolean()); System.out.println(input.readInt());
		 * byte ar1[] = {2,2,3,4,5,6,7}; byte ar2[] = {8,8,9,9,9,9,9}; out.write(ar1);
		 * inp.read(ar2); for(int i =0 ; i<ar2.length ; i++) {
		 * System.out.println(ar2[i]); } for(int i =0 ; i<ar1.length ; i++) {
		 * System.out.println(inp.read()); }
		 */
		/*
		 * System.out.println(test.isFile()); System.out.println(test.isDirectory());
		 * System.out.println(test.length()); System.out.println(test.canRead());
		 * System.out.println(test.canWrite()); System.out.println(test.lastModified());
		 * System.out.println(test.exists()); System.out.println(test.list());
		 * System.out.println(test.getPath()); System.out.println(test.getName());
		 * System.out.println(test.isAbsolute());
		 * System.out.println(test.getAbsolutePath());
		 */
	}
}
