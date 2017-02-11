package lesson20;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet<String>();
		
		treeSet.add(8);
		treeSet.add(48);
		treeSet.add(64);
		treeSet.add(4);
		treeSet.add(7);
		
		Iterator iter = treeSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		TreeSet<Car> cars = new TreeSet<Car>();
		cars.add(new Car("BMW", false, "red", 8, 160));
		cars.add(new Car("Opel", false, "red", 88, 160));
		cars.add(new Car("Trabant", false, "red", 4, 160));
		cars.add(new Car("Audi", false, "red", 12, 160));
		cars.add(new Car("VW", false, "red", 7, 160));
		
		
		for(Car car : cars) {
			System.out.println(car);
		}
	}

}
