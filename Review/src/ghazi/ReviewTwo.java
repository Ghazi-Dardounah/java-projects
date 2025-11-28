package ghazi;
import java.util.Scanner;
public  class ReviewTwo {
static Scanner read = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		System.out.println("A NEW YEAR COUNT DOWN!");
		System.out.print("Enter the number: ");
		int be = read.nextInt();
		for (int x=10 ; x>=be  ;x-=2) {
			System.out.println(x);
			Thread.sleep(1000);
			
			}
		System.out.println("HAPPY NEW YEAR MOTHER FUCKERS!!!!");
         

   
	
	}
	
	
	
}