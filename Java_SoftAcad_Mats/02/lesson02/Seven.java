package lesson02;

import java.util.Scanner;

public class Seven {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input N: ");
		int n = scanner.nextInt();
		
		int i = 7; 
		while (i <= n) {
			if (i % 7 == 0) {
				System.out.print(i + ", ");
			}
			i+=7;
		}
		System.out.println("That's it.");
	}
}
