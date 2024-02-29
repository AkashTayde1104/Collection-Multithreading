package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Generic2 {
	public static void main(String[] args) {
		List<String> Pune=new ArrayList();
		Pune.add("C1");
		Pune.add("C2");
		
		List<String> Thane=new ArrayList();
		Thane.add("c3");
		Thane.add("c4");
		
		List<String> Surat=new ArrayList();
		Surat.add("c5");
		Surat.add("c6");
		
		List<String> GandhiNagar=new ArrayList();
		GandhiNagar.add("c7");
		GandhiNagar.add("c8");
		
		List<List<String>> MH=new ArrayList();
		MH.add(Pune);
		MH.add(Thane);
		
		List<List<String>> GJ=new ArrayList();
		GJ.add(Surat);
		GJ.add(GandhiNagar);
		
		List<List<List<String>>> India=new ArrayList();
		India.add(MH);
		India.add(GJ);
		
		System.out.println("---------using iterator---------------");
		System.out.println();
		
		Iterator<List<List<String>>> iterator=India.iterator();
		while(iterator.hasNext())
		{
			List<List<String>>itr1=iterator.next();
			System.out.println(itr1);
			
			Iterator<List<String>> iterator2=itr1.iterator();
			while(iterator2.hasNext())
			{
				List<String> itr2=iterator2.next();
				System.out.println(itr2);
				
				Iterator<String> iterator3=itr2.iterator();
				while(iterator3.hasNext())
				{
					String itr3=iterator3.next();
					System.out.println(itr3);
				}
				
			}
		}
		
		System.out.println();
		System.out.println("___________using for each loop___________________");
		System.out.println();
		
		for(List<List<String>> State:India)
		{
			for(List<String> dist:State)
			{
				for(String city:dist)
				{
					System.out.println(city);
				}
			}
		}
	}

}
