package JavaProject;
import java.util.Scanner;
public class practMain {

	public static void main(String[] args) {
		Scanner ghazi = new Scanner(System.in);
		pract New = new pract();
		System.out.println("Enter the number: ");
		New.num1 = ghazi.nextInt();
		if(New.num1 > 0) {
			New.displayNumber();
		}
		else if(New.num1 == 0 || New.num1<0) {
			New.sorryError();
		}
		
	}

}
