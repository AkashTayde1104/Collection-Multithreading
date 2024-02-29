package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(109, "Rahul");
		h.put(102, "Sachin");
		h.put(101, "Jay");
		h.put(107, "Ramesh");
	//	h.put("Vijay", 1000);
		//h.put(101, 7000);
		
		System.out.println(h);
		
//		Collection val = h.values();
//		System.out.println(val);
		
//		Set keys = h.keySet();
//		System.out.println(keys);
		
//		Set entrySet = h.entrySet();
//		System.out.println(entrySet);
//		
//
//		
//		Iterator itr = entrySet.iterator();
//		while(itr.hasNext())
//		{
//		Object itr1 = itr.next();
//		System.out.println(itr1);
		
//		}
		Set<Integer> keys = h.keySet();
		System.out.println(keys);
		
		Iterator<Integer> itr2 = keys.iterator();
		while(itr2.hasNext())
		{
			int key = itr2.next();
			String value = (String)h.get(key);
			System.out.println(key);
			System.out.println(value);
		}
		
	}

}
