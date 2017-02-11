package hw01;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter a:");
		double a = sc.nextDouble();

		System.out.println("Enter b:");
		double b = sc.nextDouble();

		System.out.println("Enter c:");
		double c = sc.nextDouble();
		
		if ((a < c && c < b) || (b < c && c < a)) {
			System.out.println("C is between A and B!");
		} else {
			System.out.println("C is NOT between A and B!");
		}
	}
}
