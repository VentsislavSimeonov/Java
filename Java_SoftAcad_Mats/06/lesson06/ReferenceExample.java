package lesson06;

import lesson05.Person;

public class ReferenceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person joro = new Person();
		Person mitko = new Person();
		
		System.out.println(joro);
		System.out.println(mitko);
		
		joro.age = 18;
		mitko = joro;
		
		mitko.age = 21;
		
		System.out.println(joro.age);
		System.out.println(mitko.age);
		
		System.out.println(joro);
		System.out.println(mitko);
	}

}
