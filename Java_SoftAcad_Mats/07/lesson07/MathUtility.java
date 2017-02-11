package lesson07;

public class MathUtility {
	public static double PI = 3.1415;
	
	private double k = 8;
	
	public MathUtility(double pi) {
		MathUtility.PI = pi;
	}
	
	public static double add(double number) {
		// return number + k; // this is not OK
		// this.k = 4; // this cannot be used in a static method
		return number + PI; // this is not OK
	}
	
	public void changeStatic(double newValue) {
		MathUtility.PI = newValue;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
}
