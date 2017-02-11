package lesson18;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "0";
		text += "1";
		text += 2;
		text += true;
		
		System.out.println(text);
		
		StringBuilder builder = new StringBuilder();
		builder.append(0);
		builder.append(1).append(2).append("xMas");
		builder.append(true);
		
		
		
		String newText = builder.toString();
		
		System.out.println(newText);
		
		builder.setLength(0);
		System.out.println(builder);
		System.out.println("neshto pod prazniq red");
		
	}

}
