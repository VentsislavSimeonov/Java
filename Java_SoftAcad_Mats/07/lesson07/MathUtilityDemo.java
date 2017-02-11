package lesson07;

import lesson07.godexamplee.Christian;

public class MathUtilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MathUtility.PI);
		
		MathUtility mu = new MathUtility(3);
		MathUtility mu2 = new MathUtility(3.1);
		MathUtility mu3 = new MathUtility(4);
		
		System.out.println(mu.PI);
		
		MathUtility.add(4);
		
		mu.changeStatic(5);
		mu2.changeStatic(6);
		
		System.out.println(MathUtility.PI);
		// Christian c; // cannot access package access class from other package.
	}

}
