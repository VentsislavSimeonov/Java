package lesson13;

import lesson13.exceptions.BaseException;
import lesson13.exceptions.BusinessOperation1Exception;
import lesson13.exceptions.BusinessOperation2Exception;

public class BaseExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			method();
			method1();
			method2();
		} catch (BusinessOperation1Exception e) {
			System.out.println("BusinessOperation1Exception was handled.");
		} catch (BaseException e) {
			System.out.println("Base exception was handled.");
		}

	}

	public static void method2() throws BusinessOperation1Exception {
		throw new BusinessOperation1Exception();
	}

	public static void method1() throws BusinessOperation2Exception {
		throw new BusinessOperation2Exception();
	}

	private static void method() {
		// TODO Auto-generated method stub
		
	}

}
