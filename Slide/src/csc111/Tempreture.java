package csc111;
import java.util.Scanner;
class Tempreture {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] tempreture = new double[7];
		double sum = 0;
		System.out.println("Enter the number of degrees: ");
		int numD = input.nextInt();
		System.out.println("Enter "+numD+ " tempretures: " );
		for(int x = 0 ; x<numD ; x++ ) {
			tempreture[x] = input.nextDouble();
			sum += tempreture[x];
		}
		double average = sum/numD;
		System.out.println("the average is: "+ average);
		System.out.println("The tempretures are: ");
		for(int x = 0 ; x<numD ; x++) {
			if(tempreture[x] > average) {
				System.out.println(tempreture[x] + " above the average");
			}
			else if (tempreture[x] < average) {
				System.out.println(tempreture[x] + " below the average");
			}
			else {
				System.out.println(tempreture[x] +" THE AVERAGE");
			}
		}
		System.out.println("HAVE A NICE WEEK!");
		

	}

}
