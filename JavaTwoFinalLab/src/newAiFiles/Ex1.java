package newAiFiles;

import java.io.*;

public class Ex1 {
	public static void main(String args[]) throws IOException {
		String Line;
		try {
			FileReader FR = new FileReader("story.txt");
			BufferedReader BR = new BufferedReader(FR);
			int numberOfLines = 0;
			int numberOfWords = 0;
			while ((Line = BR.readLine()) != null) {
				numberOfLines++;
				String words[] = Line.split(" ");
				numberOfWords += words.length;
			}
			BR.close();
			File file = new File("report.txt");
			FileOutputStream fout = new FileOutputStream(file);
			PrintWriter PR = new PrintWriter(fout);
			PR.println("--- Text Analysis Report ---");
			PR.println("Total Lines: " + numberOfLines);
			PR.println("Total Words: " + numberOfWords); 
			PR.close();
			System.out.println(numberOfLines);
			System.out.println(numberOfWords);
			System.out.println("Report is Done.");
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}
//====================== ex1 ===================================		
//		File file = new File("ex.txt");
//		FileOutputStream out = new FileOutputStream(file);
//		PrintWriter pr = new PrintWriter(out);
//		pr.print("ABCD");
//		pr.close();
//		FileReader fr = new FileReader("ex.txt"); 
//		BufferedReader br = new BufferedReader(fr);
//		int w = br.read() + 1;
//		int x = br.read() + 1;
//		int y = br.read() + 1;
//		int z = br.read() + 1;
//		br.close();
//		File file2 = new File("ex2.txt");		
//		FileOutputStream out2 = new FileOutputStream(file2);
//		PrintWriter pr2 = new PrintWriter(out2);
//		pr2.println(w);
//		pr2.println(x);
//		pr2.println(y);
//		pr2.println(z);
//		pr2.close();
//		System.out.println(br.read()+1);
//		System.out.println(br.read()+1);
//		System.out.println(br.read()+1);
//		System.out.println(br.read()+1);
	}
}
