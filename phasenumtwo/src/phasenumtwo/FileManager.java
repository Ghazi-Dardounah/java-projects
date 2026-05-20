package phasenumtwo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
	public static void savePersonsInfo(Person p, String gymName) throws IOException {
		FileWriter writer = new FileWriter("Persons.txt", true);
		writer.write(gymName + "," + p.getName() + "," + p.getAge() + "," + p.getId() + "," + p.getGender() + "\n");
		writer.close();
	}

	public static String readPersonsInfo() throws IOException {
		File file = new File("Persons.txt");

		if (!file.exists()) {
			throw new IOException("Persons.txt was not found.");
		}

		Scanner reader = new Scanner(file);
		String data = "";

		while (reader.hasNextLine()) {
			data += reader.nextLine() + "\n";
		}

		reader.close();

		if (data.isEmpty()) {
			return "The file is empty.";
		}

		return data;
	}

	public static void printPersonsInfo() throws IOException {
		System.out.println(readPersonsInfo());
	}
}
