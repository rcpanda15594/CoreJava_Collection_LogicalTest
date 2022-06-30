package coll.test;

import java.util.ArrayList;

public class GenericCollectionTest {

	public static void main(String[] args) {
		// Generic type Area***********

		ArrayList<String> l = new ArrayList<>(); //Generic type of Arraylist
	//	ArrayList l = new ArrayList<String>(); //Non generic reference type Generic Runtime Object 
		l.add("Ram");
		l.add("Sita");
		l.add("Laxman");
		//l.add(10);
		System.out.println(l);

		
		m1(l);
		System.out.println(l);
		// l.add(10);

	}

	private static void m1(ArrayList l) {
		// Non Generic Area
		l.add(10);
		l.add(10.5);
	}

}
