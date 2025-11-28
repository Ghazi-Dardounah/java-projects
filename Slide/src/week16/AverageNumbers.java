package week16;
import java.util.Scanner;
class AverageNumbers {
	public static int[] separatePosNeg(int[] arr) {
		int newArr[] = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
		if (arr[i] >= 0) {
		newArr[index] = arr[i];
		index++;
		}
		}

		for (int i = 0; i < arr.length; i++) {
		if (arr[i] < 0) {
		newArr[index] = arr[i];
		index++;
		}
		}

		return newArr;
		}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.print("Enter the number of elements: ");
		int size = scanner.nextInt();

		// Read the array elements
		int[] numbers = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
		numbers[i] = scanner.nextInt();
		}

		// Call the method and print the result
		int[] sortedArray = separatePosNeg(numbers);
		System.out.println("Array with positives first and negatives last:");
		for (int num : sortedArray) {
		System.out.print(num + " ");
		}
		}



}
