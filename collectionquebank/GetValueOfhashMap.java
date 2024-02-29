package com.collectionquebank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetValueOfhashMap {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Amol", 101);
		h.put("Rakesh", 103);
		h.put("Vicky", 102);
		h.put("Ritesh",104);
		System.out.println(h);
		
		Set<String> key=h.keySet();
		System.out.println(key);
		
		Iterator itr=key.iterator();
		while(itr.hasNext())
		{
			
			String s=(String)itr.next();
			System.out.println(s);
			Object val= h.get(s);
			System.out.println(val);
			 
			
		}
		
		System.out.println("_________using for each loop____________");
		for(String s:key)
		{
			System.out.println(s);
			Integer i=(Integer)h.get(s);
			System.out.println(i);
		}
		
	}

}
