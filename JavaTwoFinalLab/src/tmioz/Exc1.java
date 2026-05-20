package tmioz;

import java.util.*;

public class Exc1 {

	public static void main(String[] args) {
//		try {
//			Test();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void Test() throws Exception {
//		try {
//			throw new ArithmeticException("Can not devide by zero");
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		throw new Exception("catch");
		Scanner input = new Scanner(System.in);
		int num;
		try {
			System.out.println("Enter number");
			num = input.nextInt();
			if (num == 1)
				throw new Exception();
			else if (num == 2)
				throw new RuntimeException();
			else
				throw new ArithmeticException();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
