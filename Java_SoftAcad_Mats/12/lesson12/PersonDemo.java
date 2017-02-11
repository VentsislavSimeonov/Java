package lesson12;

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("John");
		
		System.out.println(p2.hasTheSameName(p1));
		System.out.println(p1.hasTheSameName(p2));
	}

}
