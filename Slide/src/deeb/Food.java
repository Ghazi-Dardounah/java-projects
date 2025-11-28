package deeb;
import java.util.Scanner;
class Food {
	private String type;
	private double totalCal;
	private double fatCal;
	public static int foodCount;
	
	public Food() {
	    this.type = "" ;
		this.totalCal = 0;
		this.fatCal = 0;
		foodCount++;
	}
	public Food(String ty , double t , double f) {
		this.type = ty ; 
		this.totalCal = t;
		this.fatCal = f;
		foodCount++;
	}
	public void readData () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type: ");
		type = input.next();
		System.out.println("Enter the totalCal: ");
		totalCal = input.nextDouble();
		System.out.println("Enter the fatCal: ");
		fatCal = input.nextDouble();
	}
	public void displayInfo () {
		System.out.println("type is : "+this.type );
		System.out.println("totalCal is : "+ this.totalCal);
		System.out.println("fatCal is : "+ this.fatCal);
	}
	
	
}
