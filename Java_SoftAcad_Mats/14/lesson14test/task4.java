package lesson14test;

public class task4 {
	public static void main(String[] args) {
		String s = new String("Some String");
		String s1 = s;
		s1 = s1 + " some text";
		
		s.toUpperCase();
		
		System.out.println(s);
		System.out.println(s1);
		
		int i = 9;
		System.out.println(++i);
		System.out.println(i);
		
		System.out.println(new String("Pe60").concat(" e ").concat(" pich"));
	}
}
