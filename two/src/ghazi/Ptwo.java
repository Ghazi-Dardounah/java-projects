package ghazi;
import java.util.Scanner;
class Ptwo {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner ghazi = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = ghazi.nextInt();
		if(num>=0 && num<=10 || num>=90 && num<=100) {
			 System.out.print(num + " is a correct input.");
		}	
			else {
				System.out.print(num + " is invalid input.");
			}
			
	}
		

}


