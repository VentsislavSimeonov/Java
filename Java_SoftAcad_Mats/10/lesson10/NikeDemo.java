package lesson10;

public class NikeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Nike nike = new Nike();
		String s = "Some string";
		
		Object o = new Object();
		
		nike.doIt(s);
		nike.doIt((Object) s);
		nike.doIt(o);
	}

}
