package hw08;

public class GSMTest {
	public static void main(String[] args) {
		Call.setPriceForAMinute(1.5);
		
		
		GSM nokia = new GSM("Nokia");
		//nokia.call(nokia, -10);
		GSM samsung = new GSM("Samsung T100");
		
		nokia.insertSimCard("0898232143");
		samsung.insertSimCard("0899123345");
		nokia.call(samsung, 100);
		System.out.println(nokia.getSumForCalls());
		
		samsung.removeSimCard();
		nokia.call(samsung, 25);
		nokia.printInfoForTheLastOutgoingCall();
		
		GSM nokia2 = new GSM("Nokia");
		nokia2.insertSimCard("0812345678");
		nokia2.call(nokia, 20);
		nokia2.printInfoForTheLastOutgoingCall();
		
//		Call someCall = new Call(samsung, nokia, 15);
//		someCall.setPriceForAMinute(55);
//		
//		Call.setPriceForAMinute(55);
		
		
		
		
	}
}
