package lesson22;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main: " + i);
			Thread.sleep(1000);
		}
	}
}
