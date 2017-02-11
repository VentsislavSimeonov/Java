package hw02;

import java.util.Scanner;

public class Hw9 {
	public static void main(String[] args) {
		
		System.out.print("Input A: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println("Input B: ");
		int b = scanner.nextInt();
		int sum = 0;
		
		for (int x = a; x <= b; x ++) {
			int squareX = x * x;
			
			if( x % 3 == 0) {
				System.out.print("skip " + x);
				if( x < b ) {
					System.out.print(", ");
				}
				continue;
			} 
			
			sum += squareX;
			System.out.print(squareX);
			
			if (sum > 200) {
				break;
			} else {
				System.out.print(", ");
			}
		}
		
	}

}
