package lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap();
		
		Car car = new Car("BMW", true, "Black");
		
		final String SESSION_ID = "session id";
		
		map.put(SESSION_ID, "X1581Rk8");
		map.put("user", new Person(21, "Pencho", 123));
		map.put(car, new ArrayList());
		
		map.remove("user");
		
		System.out.println(((List) map.get(car)).size());	
		System.out.println(map.get("user"));
		System.out.println(map.get("session id"));
		System.out.println("+++++++++++++++++++++");
		
		Set set = map.keySet();
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		System.out.println("++++++++++++++++++++");
		List<String> list = new ArrayList<String>();
		list.add("5");
		list.add("4");
		//Collections.fill(list, "1");
		
		System.out.println("max element " + Collections.max(list));
		System.out.println("min element " + Collections.min(list));
		
		Collections.addAll(list, "1", "3");
		
		for (String s : list) {
			System.out.println(s);
		}

	}

}
