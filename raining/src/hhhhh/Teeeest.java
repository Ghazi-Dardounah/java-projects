package hhhhh;
import java.util.Scanner;
class Teeeest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name =input.nextLine();
		String type = "First";
		int num =2;
		System.out.println(name.substring(name.length()-2 , name.length()) + type.substring(0,2)+num);
		System.out.println(name.length());


	}

}
