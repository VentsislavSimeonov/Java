package lesson13;

import lesson12.Person;

public class ExceptionExample {
	
	private Person person;
	
	void method1 () throws ExceptionExampleException {
		try {
			Person p = new Person("John");
			person.hasTheSameName(person);
		} catch(NullPointerException npe) {
			npe.printStackTrace();
			throw new ExceptionExampleException("Grymna s null pointer exception", npe);
		}
	}
	
	void method2 () throws ExceptionExampleException {
		method1();
	}
 
	/**
	 * @param args
	 * @throws ExceptionExampleException 
	 */
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		try {
			ee.method2();
		} catch (ExceptionExampleException e) {
			System.out.println("Time in miliseconds : " + e.getCreationTimeInMiliseconds());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
