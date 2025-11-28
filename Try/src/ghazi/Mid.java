package ghazi;
import java.util.Scanner;
public class Mid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("The Exponent Of first three numbers are\n");
        for(int i = 1 ; i<=n ; i++) {
        	for(int j = 1 ; j<=5 ; j++) {
        		System.out.print(i + "^" + j + "= " + (int)Math.pow(i , j) );
        		System.out.print("\t");
        	}
        	System.out.println(" ");
        }
        
    }
}
