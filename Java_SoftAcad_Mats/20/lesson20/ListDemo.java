package lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import lesson19.serialization.Car;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list2 = new ArrayList();
		LinkedList list1 = new LinkedList();
		
		list1.add("1");
		list1.add("2");
		list1.add("5");
		list1.add("3");
		list1.add("5");
		list1.add(4);
		list1.add(444);
		list1.add("5");
		list1.add("444");
		list1.add(new Car("BMW", false, "Black"));
		
		list1.remove(3);
		
		List fives = new ArrayList();
		fives.add("5");
		list1.removeAll(fives);
		list1.add(1, new Car("Opel", false, "Red"));
		
		System.out.println("list size is: " + list1.size());
		
		Iterator iter = list1.iterator();
		
		//list1.add("666");
		
		while(iter.hasNext()) {
			Object obj = iter.next();
			// iter.remove(); // will remove last element
			System.out.println(obj);
		}
		
		Car car = new Car("Opel", false, "Red");
		System.out.println("Opels hashCode is " + car.hashCode());
		
		
		
//		for (Object obj : list1) {
//			System.out.println(obj);
//		}
		
	}

}
