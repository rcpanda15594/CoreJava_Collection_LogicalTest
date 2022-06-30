package coll.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("Ram");
		list.add("Sita");
		list.add("Laxman");
		list.add("Hanuman");
		list.add("Hanuman");
		list.add(null);list.add("");
		System.out.println(list.size());

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("===========================================");
		List<String> vlist = new Vector<>();

		System.out.println(vlist.size());
		vlist.add("Ram");
		vlist.add("Sita");
		vlist.add("Laxman");
		vlist.add("Hanuman");
		System.out.println(vlist.size());

		for (String s : vlist) {
			System.out.println(s);
		}
		System.out.println("===========================================");
		Set<String> s = new HashSet<>();
		System.out.println(s.size());
		s.add("Ram");
		s.add("Sita");
		s.add("Ram");
		s.add("Hanuman");
		System.out.println(s.size());
		for (String s1 : s) {
			System.out.println(s1);
		}
	}

	ArrayList a = new ArrayList<>();
	
	List l = Collections.synchronizedList(a);
	
}
