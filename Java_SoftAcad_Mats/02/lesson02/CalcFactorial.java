package lesson02;

import java.util.Scanner;

public class CalcFactorial {
	

	public static void main(String[] args) {

		int first = 0;
		boolean sustavno;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Value: ");
			first = sc.nextInt();
			sustavno = true;
			if (first < 0) {
				System.out.println("Въвели сте отрицателно число (" + first
						+ ") моля опитайте пак ");
				continue;
			}
			for (int i = 2; i < 10; i++) {

				// System.out.print(i+", ");
				if (first == i) {
					continue;
				}
				if ((first % i == 0) && (first != 0)) {
					sustavno = false;
					System.out.println("Числото " + first + " е съставно");
					break;
				}

			}
			if (first == 0 || first == 1) {
				System.out.println("Числото " + first
						+ " не е нито просто нито съставно: ");
			} else if ((first % 1 == 0) && (first % first == 0) && sustavno) {
				System.out.println("Числото " + first + " е просто");
			}

		}
	}

}
