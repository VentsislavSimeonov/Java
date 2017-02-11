package lesson07;

public class FinalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person mincho = new Person();
		
		Person gincho = new Person();
		
//		mincho.setAgeForOtherPerson(gincho);
//		mincho.setAgeForOtherPerson(new Person());
//		
		System.out.println(mincho);
		
		Person geri = new Person();
		geri.setAgeForOtherPerson(mincho);
		
		System.out.println(mincho);
	}

}
