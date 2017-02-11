package lesson01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("Please input your age: ");
		Scanner scanner = new Scanner(System.in);
		
		int varAge = scanner.nextInt();
		
		System.out.println("Next year you will be " + ++varAge);

		// 
		// varAge = varAge + 1;
		// System.out.println("Next year you will be " + varAge);
		
		
		// varAge--; // is equivalent to
		// varAge = varAge - 1;
		System.out.println(varAge);
	}

}
