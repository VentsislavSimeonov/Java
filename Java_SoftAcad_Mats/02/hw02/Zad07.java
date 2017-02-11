package hw02;

import java.util.Scanner;

public class Zad07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 3; i <= 3*n; i+=3){
			System.out.print(i);
			if(i != 3 * n) {
				System.out.print(",");
			}
		}
	}
}
