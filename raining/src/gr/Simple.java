package gr;
import java.util.Scanner;
class Simple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		System.out.println("Enter the distance is KM: ");
		int distance = input.nextInt();
		if (distance > 30) {
			total = 10+ distance*2;
			total = total - (total*0.1);
		}
		else {
			total = 10 + distance*2;
		}
		System.out.println("Total fare : " + total);
	
	} 
}