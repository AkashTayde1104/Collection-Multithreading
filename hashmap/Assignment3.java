package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment3 {
	public static void main(String[] args) {
		List<String> State1=new LinkedList();
		State1.add("dist1");
		State1.add("dist2");
		
		List<String> State2=new LinkedList();
		State2.add("dist3");
		State2.add("dist4");
		
		List<String> State3=new LinkedList();
		State3.add("dist1");
		State3.add("dist2");
		
		List<String> State4=new LinkedList();
		State4.add("dist3");
		State4.add("dist4");
		
		List<List<String>> MH=new LinkedList();
		MH.add(State1);
		MH.add(State2);
		
		List<List<String>> GJ=new LinkedList();
		GJ.add(State3);
		GJ.add(State4);
		
		Map<String, List<List<String>> > World=new HashMap();
		World.put("Maharashtra", MH);
		World.put("Gujrat", GJ);
		System.out.println(World);
		
		Set<String> key=World.keySet();
		System.out.println(key);
		
		System.out.println();
		System.out.println("___________iterator__________");
		
		Iterator<String> itr = key.iterator();
		while(itr.hasNext())
		{
			String keys= itr.next();
			System.out.println(keys);
			List<List<String>> value = World.get(keys);
			System.out.println(value);
			
			Iterator<List<String>> itr2=value.iterator();
			while(itr2.hasNext())
			{
				List<String> val=itr2.next();
				System.out.println(val);
				
				Iterator<String> itr3=val.iterator();
				while(itr3.hasNext())
				{
					String val1=itr3.next();
					System.out.println(val1);
				}
			}
		}
		System.out.println();
		System.out.println("_____________for each loop___________");
		
		for(String k:key)
		{
			System.out.println(k);
			List<List<String>> Value1=World.get(k);
			System.out.println(Value1);
			
			for(List<String> vall:Value1)
			{
				for(String vall1:vall)
				{
					System.out.println(vall1);
				}
			}
		}
	}

}
