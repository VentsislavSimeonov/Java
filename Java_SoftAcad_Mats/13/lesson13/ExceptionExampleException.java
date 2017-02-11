package lesson13;

import java.util.Date;

public class ExceptionExampleException extends Exception {

	private long time;
	
	public ExceptionExampleException(String message, NullPointerException npe) {
		super(message, npe);
		this.time = new Date().getTime();
	}

	public long getCreationTimeInMiliseconds() {
		return this.time;
	}
}
