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
				System.out.println("������ ��� ����������� ����� (" + first
						+ ") ���� �������� ��� ");
				continue;
			}
			for (int i = 2; i < 10; i++) {

				// System.out.print(i+", ");
				if (first == i) {
					continue;
				}
				if ((first % i == 0) && (first != 0)) {
					sustavno = false;
					System.out.println("������� " + first + " � ��������");
					break;
				}

			}
			if (first == 0 || first == 1) {
				System.out.println("������� " + first
						+ " �� � ���� ������ ���� ��������: ");
			} else if ((first % 1 == 0) && (first % first == 0) && sustavno) {
				System.out.println("������� " + first + " � ������");
			}

		}
	}

}
