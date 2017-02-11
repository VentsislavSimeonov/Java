package lesson01;

public class VariableExample {
	public static void main(String[] args) {
		
		int myVariable = 10;
		System.out.println(myVariable);
		
		byte someByte = 127;
		System.out.println(someByte);
		
		someByte = 1 + 124;
		
		System.out.println(someByte);
		
		long sum = 32523642246L;
		System.out.println(sum);
		
		int intVariable = 5 * 3 ;
		System.out.println(intVariable);
		
		intVariable = 10 / 3; 
		System.out.println(intVariable);
		
		intVariable = 10 % 3;
		
		System.out.println(intVariable);
		
		intVariable = someByte + 5;
		System.out.println(intVariable);
		System.out.println(someByte);
		
		float someFloat = 1.1f;
		System.out.println(someFloat);
		
		double someDouble = someFloat * 3;
		System.out.println(someDouble);
		
		System.out.println(someFloat);
		
		boolean someBoolean = false;
		System.out.println(someBoolean);
		
		char someChar = '*';
		System.out.println(someChar);
		
		int intVar = 5;
		System.out.println(intVar);
		
		// intVar += 7;
		intVar = intVar + 7;
		System.out.println(intVar);
		
		intVar /= 5;
		intVar %= 3;
		intVar *= 2;
		System.out.println(intVar);
		
		// == , != 
		
		
		
		System.out.println(5 == intVar);
		System.out.println(intVar == 4);
		
		System.out.println(5 != 3);
		System.out.println(5 != 5);
		
	}
}
