package his;
import java.util.Scanner;
class Car {
	private String model;
	private int year;
	private double price;
	
	public void setPrice(double p) {
		if(p < 0) {
			System.out.println("Not allowed");
		}
		else {
			price = p;
		}
	}
	public void readInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year :");
		year = s.nextInt();
		System.out.println("Enter the model : ");
		s.nextLine();
		model = s.nextLine();
		System.out.println("Enter the price : ");
		double x = s.nextDouble();
		setPrice(x);
	}
	public double priceAfterVat() {
		return (price + price*0.15) ;
	}
	public void disPlayInfo() {
		System.out.println("Model : " + model );
		System.out.println("Year : " + year);
		System.out.println("Price : "+ price);
		System.out.println("Price After Vat : " + this.priceAfterVat());
	}
	public static void main(String [] args) {
		Car h = new Car();
		h.readInput();
		h.disPlayInfo();
	}
}
