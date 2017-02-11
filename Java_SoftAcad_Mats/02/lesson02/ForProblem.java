package lesson02;

import java.util.Scanner;

public class ForProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input n: ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print(n + " ");
		}

	}

}
