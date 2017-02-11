package hw01;

import java.util.Scanner;

public class Zad4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = scanner.nextInt();
		
		System.out.println("Enter b:");
		int b = scanner.nextInt();
		
		if(a > b) {
			System.out.println(b + " " + a);
		} else {
			System.out.println(a + " " + b);
		}
	}

}
