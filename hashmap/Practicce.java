package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Practicce {
	public static void main(String[] args) {
		
		List<String> s1= new ArrayList();
		s1.add("d1");
		s1.add("d2");
		
		Set<String> s2=new HashSet();
		s2.add("d3");
		s2.add("d4");
		
		HashMap h=new HashMap();
		h.put("List", s1);
		h.put("Set", s2);
		System.out.println(h);
		
		Set<String> keys=h.keySet();
		System.out.println(keys);
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			
			Object val=h.get(s);
			System.out.println(val);
			
			if(val instanceof List)
			{
				List l1=(List)val;
				Iterator itr1 = l1.iterator();
				while(itr1.hasNext())
				{
					String s11=(String)itr1.next();
					System.out.println(s11);
				}
		
			}
		}
			
		}
}
