package hw01;

import java.util.Scanner;

public class Zad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A1:");
		double a1 = sc.nextDouble();
		
		System.out.println("Enter A2");
		double a2 = sc.nextDouble();
		
		System.out.println("Enter A3");
		double a3 = sc.nextDouble();
		
		double temp = a2;
		a2 = a3;
		a3 = a1;
		a1 = temp;
		
	}
}
