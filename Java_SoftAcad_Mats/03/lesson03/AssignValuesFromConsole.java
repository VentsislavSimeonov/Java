package lesson03;

import java.util.Scanner;

public class AssignValuesFromConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] someArray = new int[10];
		for (int i = 0; i < 10; i++) {
			someArray[i] = scanner.nextInt();
		}
		
		System.out.println("Let's print the array:");
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(someArray[i] + " ");
		}
		
	}

}
