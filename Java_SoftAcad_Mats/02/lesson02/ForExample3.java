package lesson02;

public class ForExample3 {
	
	public static void main(String[] args) {
		for (int i = 1; i < 15; i++) {
			if (i >=7 && i <= 10) {
				continue;
			}
			System.out.println(i);
		}
	}
}
