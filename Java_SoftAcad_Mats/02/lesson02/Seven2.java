package lesson02;

import java.util.Scanner;

public class Seven2 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input N: ");
		int n = scanner.nextInt();
	
		int biggestNumber = n - n%7; // start with the biggest number smaller than N which 
									 // is divided by 7 without remainder.
		
		while (biggestNumber > 0) {
			System.out.println(biggestNumber);
			biggestNumber -= 7;
		}
		System.out.println("that's it.");
	}

}
