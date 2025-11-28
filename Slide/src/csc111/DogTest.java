package csc111;
import java.util.Scanner;
public class DogTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dog d = new Dog();
		System.out.println("Enter the dog name: ");
		d.name = input.next();
		System.out.println("Enter the dog age: ");
		d.age = input.nextInt();
		d.ageCondition();
		System.out.println("Enter the dog color: ");
		d.color = input.next();
		System.out.println("Enter the year: ");
		d.yearOfGet = input.nextInt();
		d.output1();
		
	}

}
