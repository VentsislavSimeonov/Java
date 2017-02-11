package lesson02;

import java.util.Scanner;

public class HW6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type number A");
		int a = scanner.nextInt();
		
		System.out.println("Type number B");
		int b = scanner.nextInt();
		
		System.out.println("Type number C");
		int c = scanner.nextInt();
		
		int atemp = a;
		a = b;
		b = c;
		c = atemp;
		
		System.out.println(a + " " + b + " " + c);
	}

}
