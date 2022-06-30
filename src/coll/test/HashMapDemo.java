package coll.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		System.out.println(hm.size());
		hm.put("Ram", 100);
		hm.put("Sita", 101);
		hm.put("Laxman", 102);
		hm.put("Hanuman", 103);
		System.out.println(hm);
		System.out.println(hm.size());
		
		System.out.println(hm.put("Bharata",104));
		System.out.println(hm.size());
		
		
		Set s = hm.keySet();
		System.out.println("Key Set Values---------------"+s);
		
		//Can't cast to List 
		/*List l = (List) hm.keySet();
		System.out.println("Key Set Values---------------"+l);*/
		
		Collection c = hm.values();
		System.out.println("Collection Values---------------"+c);
		
		
		Set s1 = hm.entrySet();
		System.out.println("Entry Set Values--------------------"+s1);
		
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry  object = (Map.Entry) itr.next();
			
			System.out.println("Key---"+object.getKey()+"======================Values---"+object.getValue());
			if(object.getKey().equals("Bharat")){
				object.setValue(105);
			}
			
		}
		System.out.println(hm);
		
		
		
		
	}

}
