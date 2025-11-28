package po;
import java.util.Scanner;
class Ticket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);;
		double price = 0;
		System.out.println("Enter the movie type (A/B) : ");
		String type = input.next();
		if (type.equalsIgnoreCase("A")) {
			price = 50;
		}
		else if (type.equalsIgnoreCase("B")) {
			price = 35;
		}
		else {
			System.out.println("Invalid type!");
			System.exit(0);
		}
		System.out.println("Do you have a membership? (Y/N) ");
		String memberS = input.next();
		if (memberS.equalsIgnoreCase("Y")) {
			price = price - (price*0.25);
		}
		else {
			price = price ; 
		}
		System.out.println("Total price : " + price);

	}

}
