package lesson05;

public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "Pencho";
		String pencho = "Pencho";
		System.out.println(str1 == pencho );
		
		String str2 = new String("Pencho");
		String pencho2 = new String("Pencho");
		System.out.println(str2.equals(pencho2));
		System.out.println("new string equals to new string " +  (str2 == pencho2));
		
		System.out.println(str1);
		
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		System.out.println();
		
		String message = " \t\"Hello \\ \n'\'world.\""; // \n
		System.out.println(message);
		
		System.out.println(message.length());

	}

}
