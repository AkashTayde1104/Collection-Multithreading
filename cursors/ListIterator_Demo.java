package com.cursors;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo {
	public static void main(String[] args) {
		List l=new LinkedList();
		l.add("Ritesh");
		l.add("Shyam");
		l.add("Ram");
		l.add("Sachin");
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
			
			if(s.equals("Shyam"))
			{
				itr.remove();
			}
			else if(s.equals("Ram"))
			{
				itr.set("Hello");
			}
			else if(s.equals("Sachin"))
			{
				itr.add("Shyam");
			}
		}
		System.out.println(l);
		
	}

}
