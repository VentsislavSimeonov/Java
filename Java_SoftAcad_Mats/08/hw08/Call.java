package hw08;

public class Call {
	public static final int MIN_CALL_DURATION = 0;
	public static final int MAX_CALL_DURATION = 120;
	private static double priceForAMinute;
	private GSM caller;
	private GSM receiver;
	private double duration;
	
	public Call(GSM caller, GSM receiver, double duration) {
		setCaller(caller);
		setReceiver(receiver);
		setDuration(duration);
	}
	
	public GSM getCaller() {
		return this.caller;
	}
	
	public void setCaller(GSM caller) {
		this.caller = caller;
	}

	public static double getPriceForAMinute() {
		return priceForAMinute;
	}

	public static void setPriceForAMinute(double priceForAMinute) {
		Call.priceForAMinute = priceForAMinute;
	}

	public GSM getReceiver() {
		return receiver;
	}

	public void setReceiver(GSM receiver) {
		this.receiver = receiver;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if(checkDuration(duration)) {
			this.duration = duration;
		} else {
			this.duration = 0;
		}
	}
	
	public static boolean checkDuration(double duration) {
		if(duration < MIN_CALL_DURATION || duration > MAX_CALL_DURATION) {
			System.out.println("Not a valid duration!");
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "caller: " + caller.getModel() + "; callerNumber: " 
				+ caller.getSimCardNumber() + "; receiver: " + receiver.getModel()
				+ "; receiverNumber: " + receiver.getSimCardNumber() + "; duration: "
				+ duration; 
	}
	
}
