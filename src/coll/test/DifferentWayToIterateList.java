package coll.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DifferentWayToIterateList {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("ABC","BBC","CBC","DBC");
		
		System.out.println("------------------Enchanced ForLoop----------------------");
		for(String s:list){
			System.out.println(s);
		}

		System.out.println("------------------Normal ForLoop----------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------While Loop--------------------------------");
		
		int i = 0;
		while(i< list.size()){
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("-------------------Iterator Loop--------------------------");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
		//	String s = (String)itr.next();
			//System.out.println(s);
			System.out.println(itr.next());
		}
		
		
		System.out.println("----------------ListIterator  Loop--------------------------");
		
		ListIterator litr = list.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		System.out.println("----------------Iterable for Loop--------------------------");
		
		list.forEach(l-> System.out.println(l));
		
		System.out.println("----------------Stream  Loop--------------------------");
		
		list.stream().forEach((r) -> System.out.println(r));
		
	}

}
