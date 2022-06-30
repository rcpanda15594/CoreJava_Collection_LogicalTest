package coll.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ItterateMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		map.put(100, new Employee("Ramesh", "ramesh@gmail.com", 1000.00, 90909009));
		map.put(101, new Employee("Ashok", "Ashok@gmail.com", 1000.00, 90909009));
		map.put(102, new Employee("Radhe", "ramesh@gmail.com", 1000.00, 90909009));
		map.put(103, new Employee("Sachin", "ramesh@gmail.com", 1000.00, 90909009));

		// System.out.println(map);
		System.out.println();
		System.out.println("========================Traditional Pattern ===================================");

		Set<Entry<Integer, Employee>> m = map.entrySet();
		for (Entry<Integer, Employee> m1 : m) {
			System.out.println(m1.getKey() + "\t" + m1.getValue());
		}

		System.out.println();
		System.out.println("========================Advance For loop Pattern ===================================");

		Set<Integer> set = map.keySet();
		for (Integer I : set) {
			// System.out.println(map.keySet() + "\t" + map.entrySet());
			System.out.println(I + "\t" + map.get(I));
			// System.out.println(map.entrySet());
		}

		System.out.println();
		System.out.println("========================Java 8 For loop Pattern ===================================");
		map.forEach((k, v) -> System.out.println(k + "\t" + v));
	}

}
