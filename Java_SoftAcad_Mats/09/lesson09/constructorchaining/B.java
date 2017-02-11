package lesson09.constructorchaining;

public class B extends A {
	public B() {
		super("super A!");
		System.out.println("Constructor of class B");
	}
	
	protected int someInt = 10;
	
	protected void someMethod() {
		System.out.println("base b implementation");
	}
	
	public void someOtherMethod() {
		System.out.println("other method implementation in B");
	}
}
