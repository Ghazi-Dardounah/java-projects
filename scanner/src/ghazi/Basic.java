package ghazi;
import java.util.Scanner;
class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ghazy = new Scanner(System.in);
		String item;
		int many;
		double prise;
		double total;
		System.out.print("Enter the item name: ");
		item = ghazy.nextLine();
		System.out.print("How many one of them will you buy? ");
		many = ghazy.nextInt();
		System.out.print("How much does a single one cost? " );
		prise = ghazy.nextDouble();
		total = prise*many;
		System.out.println("you have bought "+many + " " +item+"/s");
		System.out.println("your total is: "+ total+ " $");
		
		
		
		
		

    }
}	
