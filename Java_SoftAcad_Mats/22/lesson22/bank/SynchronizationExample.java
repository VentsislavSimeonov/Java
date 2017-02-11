package lesson22.bank;


public class SynchronizationExample {
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account();
		
		Thread client2 = new BankClient(acc, 500);
		Thread client1 = new BankClient(acc, 100);
		
		client1.start();
		client2.start();
		
		client1.join();
		client2.join();
		
		System.out.println("Balance: " + acc.getAmount());
	}
}
