package hw02;

import java.util.Scanner;

public class Zad09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			int number = i * i;
			if(i % 3 == 0) {
				System.out.print("skip " + i + ", ");
				continue;
			}
			System.out.print(number);
			sum += number;
			if(sum > 200) {
				break;
			}
			System.out.print(", ");
		}
	}
}
