package hw08;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgongCall;
	
	public GSM(String model) {
		this.simMobileNumber = "";
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void insertSimCard(String number) {
		if (!number.startsWith("08") || number.length() != 10) {
			System.out.println("Wrong number!");
			return;
		}
		this.simMobileNumber = number;
		this.hasSimCard = true;
	}
	
	public void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = "";
	}
	
	public void call(GSM receiver, double duration) {
		if(!isValidCall(this, receiver, duration)) {
			return;
		}
		
		Call call = new Call(this, receiver, duration);
		this.lastOutgongCall = call;
		receiver.lastIncomingCall = call;
		this.outgoingCallsDuration += duration;
	}
	
	private static boolean isValidCall(GSM caller, GSM receiver, double duration) {
		if (!Call.checkDuration(duration)) {
			return false;
		}
		if(caller == receiver || caller.simMobileNumber.equals(receiver.simMobileNumber)) {
			System.out.println("The receiver must be different than the caller");
			return false;
		}
		if(!caller.hasSimCard || !receiver.hasSimCard) {
			System.out.println("Caller and receiver must have sim card");
			return false;
		}
		return true;
	}
	
	public double getSumForCalls() {
		return outgoingCallsDuration * Call.getPriceForAMinute();
	}
	
	public String getSimCardNumber() {
		if (this.simMobileNumber == null) {
			return "";
		} else {
			return this.simMobileNumber;
		}
	}
	
	public void printInfoForTheLastOutgoingCall(){
		//System.out.println(lastOutgongCall.toString());
		System.out.println(lastOutgongCall);
	}
	
	public void printInfoForTheLastIncomingCall() {
		System.out.println(lastIncomingCall);
	}
	
}
