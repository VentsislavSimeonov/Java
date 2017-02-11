package lesson10;

public class SumsungDVDRemoteController implements IDVDRemoteController {

	@Override
	public void play() {
		System.out.println("Sumsung dvd remove is playing...");
	}

	@Override
	public void eject() {
		System.out.println("Sumsung dvd remove is ejecting...");
	}

	@Override
	public void insertDisk() {
		System.out.println("Sumsung dvd remove is inserting disk...");
	}

	@Override
	public void stop() {
		System.out.println("Sumsung dvd remove is stoping...");
	}
	
	public void someMethod(String str1, double d2, int int3) {
		
	}
	
	private int someMethod(double doubleVar, String someString, int x) {
		return 1	;
	}

}
