package lesson09.constructorchaining;

public class C extends B {
	public C () {
		super();
		System.out.println("Constructor of class C");
	}
	
	public int someInt;
	
	public void someMethod() {
		System.out.println("C implementation");
	}
	
	// public in base class cannot be overridden with protected
//	protected void someOtherMethod() {
//		System.out.println("bla");
//	}
}
