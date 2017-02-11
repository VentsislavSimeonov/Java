package lesson10;

public class SonyDVDRemoteController implements IDVDRemoteController {

	public void play() {
		System.out.println("Sony dvd remove is playing...");
	}

	public void eject() {
		System.out.println("Sony dvd remove is ejecting...");
	}

	public void insertDisk() {
		System.out.println("Sony dvd remove is inserting disk...");
	}

	public void stop() {
		System.out.println("Sony dvd remove is stoping...");
	}

}
