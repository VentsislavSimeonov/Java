package lesson02;
import java.util.Scanner;

public class HW5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if((a > b) && (a > c) && (b > c )) {
			// System.out.println(a + " " + b + " " + c);
			System.out.printf("%d %d %d", a, b, c);
		} else if((a>c) && (c>b)){
			System.out.printf("%d %d %d", a, c, b);
		}
		if((b > c) && (b > a)){
			if(c > a) {
				System.out.printf("%d %d %d", b, c, a);
			} else {
				System.out.printf("%d %d %d", b, a, c);
			}
		}
		if((c > a) && (c > b)) {
			if(a > b) {
				System.out.printf("%d %d %d", c, a, b);
			}
			else {
				System.out.printf("%d %d %d", c, b, a);
			}
		}
		
		}

}
