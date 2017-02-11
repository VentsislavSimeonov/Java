package lesson12;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int i = 5;
			Person p = new Person();
			Person p1 = new Person("John");
			p.hasTheSameName(p1);
			System.out.println(i++);
			p.hasTheSameName(p1);
		} catch (NullPointerException npe) {
			System.out.println("NPE occurred");
		}
		
	}
}
