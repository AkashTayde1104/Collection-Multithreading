package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Generic {
	public static void main(String[] args) {

		List<String> MH=new ArrayList();
		MH.add("Pune");
		MH.add("Thane");
		
		List<String> GJ =new ArrayList();
		GJ.add("GandhiNagar");
		GJ.add("Suart");
		
		List<List<String>> India=new ArrayList();
		India.add(MH);
		India.add(GJ);

		System.out.println("___________using iterator_________________");
		
		Iterator<List<String>> iterator=India.iterator();
		while(iterator.hasNext())
		{
			List<String>itr=iterator.next();
			System.out.println(itr);
			
			Iterator<String> iterator2=itr.iterator();
			while(iterator2.hasNext())
			{
				String itr2=iterator2.next();
				System.out.println(itr2);
			}
		}
	System.out.println();
		System.out.println("___________using for each loop________________");
		
		for(List<String> state:India)
		{
			for(String dist:state )
			{
				System.out.println(dist);
			}
		}
		}

		}



