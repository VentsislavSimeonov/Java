package lesson20;

import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("4");
		stack.push("5");
		
		System.out.println("stack size: " + stack.size());

		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("stack size: " + stack.size());
	}

}
