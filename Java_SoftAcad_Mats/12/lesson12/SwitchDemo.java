package lesson12;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		
		switch(i) {
		case 1:
			System.out.print(" 1 ");
		case 2:
		case 3:
			System.out.print(" 2 or 3 ");
			break;
		case 5:
			System.out.print(" 5 " );
			break;
		default:
			System.out.print("default");
		}
	}

}
