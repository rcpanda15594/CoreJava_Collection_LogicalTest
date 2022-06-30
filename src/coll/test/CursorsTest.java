package coll.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CursorsTest {

	public static void main(String[] args) {
		Vector vlist = new Vector<>();

		System.out.println(vlist.size());
		vlist.add("Ram");
		vlist.add("Sita");
		vlist.add("Laxman");
		vlist.add("Hanuman");
		System.out.println(vlist.size());

		while (vlist.isEmpty() == true) {
			for (int i = 0; i < vlist.size(); i++) {
				System.out.println(vlist.indexOf(i));
			}
		}
		System.out.println("===========================================");
		
		
		Enumeration e = vlist.elements();
		
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			System.out.println(string);
		}
		
		System.out.println("===========================================");
		Iterator i = vlist.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
