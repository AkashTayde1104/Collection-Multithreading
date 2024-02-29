package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Generic1 {
	public static void main(String[] args) {
		
	List<String> MH=new ArrayList();
	MH.add("Pune");
	MH.add("Thane");
	
	List<String> GJ =new ArrayList();
	GJ.add("GandhiNagar");
	GJ.add("Suart");
	
	List<String> s1=new ArrayList();
	s1.add("d1");
	s1.add("d2");
	
	List<String> s2=new ArrayList();
	s2.add("d3");
	s2.add("d4");
	
	List<List<String>> India=new ArrayList();
	India.add(MH);
	India.add(GJ);
	
	List<List<String>> Japan=new ArrayList();
	Japan.add(s1);
	Japan.add(s2);
	
	List<List<List<String>>> World=new ArrayList();
	World.add(India);
	World.add(Japan);
	
System.out.println("_________________using iterator___________________");
System.out.println();
	
	Iterator<List<List<String>>> iterator = World.iterator();
	while(iterator.hasNext())
	{
		List<List<String>> itr = iterator.next();
		System.out.println(itr);//Object in Object[[----]]
		
		Iterator<List<String>> iterator2 = itr.iterator();
		while(iterator2.hasNext())
		{
			List<String> itr2 = iterator2.next();
			System.out.println(itr2);//object in array[----]
			
			Iterator<String> iterator3 = itr2.iterator();
			while(iterator3.hasNext())
			{
				String itr3 = iterator3.next();
				System.out.println(itr3);//collect object ----
			}
		}
	}
	
	System.out.println("___________using for each loop______________________");
	System.out.println();
	
	
	for(List<List<String>> State:World)
	{
		System.out.println(State);
		
		for(List<String> Dist : State)
		{
			System.out.println(Dist);
			
		for(String City: Dist)
		{
			System.out.println(City);
		}
		}
	}
	
	
}


}
