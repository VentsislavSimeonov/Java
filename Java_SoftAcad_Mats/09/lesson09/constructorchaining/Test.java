package lesson09.constructorchaining;

public class Test {
	public static void main(String[] args) {
		C c = new C();
		Object o = new Object();

		c.someInt = 5;
		
		System.out.println(c.someInt);
	}
}
