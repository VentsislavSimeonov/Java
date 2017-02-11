package lesson03;

import java.util.Scanner;

public class UserDefinedArraySize {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arraySize = 0;
		
		do {
			System.out.println("Input array size: ");
			arraySize = scanner.nextInt();
		} while (arraySize <= 0);
		
		int[] myArray = new int[arraySize];
		
		// myArray.length
		for (int i = 0; i < arraySize; i++) {
			myArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < myArray.length; i++ ) {
			System.out.print(myArray[i] + " ");
		}
		
	}
}
