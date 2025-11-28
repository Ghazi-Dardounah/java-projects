package khaled;
import java.util.Scanner;
public class mainMethod {

	public static void main(String[] args) {
		Scanner bassam = new Scanner(System.in);
		whole c = new whole();
		System.out.println("Enter the number R: ");
		c.radius = bassam.nextDouble();
		c.displayRadius();
		
		System.out.println("Area = "+ c.calculateArea());

	}

}
