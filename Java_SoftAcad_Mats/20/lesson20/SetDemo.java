package lesson20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set someSet = new LinkedHashSet<String>(); // HashSet();
		// Set someTreeSet = new TreeSet();
		
		someSet.add("1");
		someSet.add("2");
		someSet.add("4");
		
		System.out.println(someSet.size());
		someSet.add("2");
		someSet.add("2");
		someSet.add("3");
		someSet.add("2");
		someSet.add("2");
		
		System.out.println(someSet.size());
		
		System.out.println("contains 5: " + someSet.contains("5"));
		System.out.println("contains 3: " + someSet.contains("3"));
		
		System.out.println("++++++++++++++++++++++");
		
		Iterator iter = someSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		

	}

}
