package hw01;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();
		
		int sum = a + b;
		int difference = a - b;
		int multi = a * b;
		int division = a / b;
		
		System.out.println("Sum:" + sum);
		System.out.println("Difference:" + difference);
		System.out.println("multiplication:" + multi);
		System.out.println("Division:" + division);
	}
}
