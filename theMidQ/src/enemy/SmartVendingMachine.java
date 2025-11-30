package enemy;
import java.util.Scanner;
public class SmartVendingMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int  stock =10;
		int numberOfSnacks;
		for(int i =1 ; i<=5 ; i++) {
			System.out.print("Customer "+ i +" - Enter number of snacks: ");
			numberOfSnacks = input.nextInt();
			if(numberOfSnacks <= stock) {
				stock -= numberOfSnacks;
				System.out.println("Customer served. Remaining snacks: "+stock);
			}
			else if(numberOfSnacks > stock) {
				System.out.println("Not enough stock! Only "+stock +" snacks left.");
				continue;
			}
			if(stock == 0) {
				System.out.println("Machine empty! Restocking...");
				stock = 10;
				continue;
			}
		}

	}

}
