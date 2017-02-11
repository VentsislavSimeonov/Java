package lesson09;

public class AccessModifer {
	public int a = 0;
	protected int b = 1;
	private int c = 2;
	int d = 3;
	
	public AccessModifer() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
