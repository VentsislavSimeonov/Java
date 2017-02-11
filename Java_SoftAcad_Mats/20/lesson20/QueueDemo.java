package lesson20;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new ConcurrentLinkedDeque();

		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		queue.offer("4");
		queue.offer("5");
		
		System.out.println(queue.peek());
		
		System.out.println("+++++++++++++++++++");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
