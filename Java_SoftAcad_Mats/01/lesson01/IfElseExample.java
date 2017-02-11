package lesson01;

public class IfElseExample {

	public static void main(String[] args) {
		
		// if with boolean value
		if(true) { // if can also accept false
			System.out.println("Statement was true");
		} else {
			System.out.println("statement was false");
		}
		
		// if with boolean variable
		boolean boolStatement = true;
		if(boolStatement) {
			System.out.println("Boolean Statement was true");
		} else {
			System.out.println("Boolean statement was false");
		}
		
		// if with comparison 
		int a = 5;
		int b = 3;
		
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is not greater than b");
		}
		
		boolean bool = false;
		int a1 = 5;
		int b1 = 3;
		
		if (a1 > b1 && !bool) {
			System.out.println("Statement was true"); // prints "Statement was true" and moves the cursor on a new line
			System.out.println(55); 
			// System.out.print(55); will print 55 in console without moving the cursor on a new line
		} else {
			System.out.println("statement was false");
		};
		
		
		boolean x1 = false;
		boolean y1 = true;
		
		if(x1 && y1);
		{
			if(x1 || y1) {
				System.out.println("Yes");
			}
		}
		
		
		boolean x = false;
		boolean y = true;
		
		int a2, b2 = 1;
		// System.out.println("a2 = " + a2); // Error - a2 is not initialized
		System.out.println("b2 = " + b2);
		
		a2 = 2;
		System.out.println("a2 = " + a2);
		
		if(x && y) {
			if(x || y) {
				System.out.println("Yes");
			}
		} else {
			if (x) {
				System.out.println(x);
			}
		}
		
	}

}
