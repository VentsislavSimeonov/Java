package lesson02;

import java.util.Scanner;

public class SumExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Input n: ");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <=n; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("sum is " + sum);
	}

}
