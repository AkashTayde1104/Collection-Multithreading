package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_getSeperateData {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add("Jay");
		l.add("Rahul");
		l.add('c');
		
		System.out.println(l);
		
		Iterator iterator=l.iterator();
		while(iterator.hasNext())
		{
			Object obj=iterator.next();
			if(obj instanceof Integer)
			{
				int i=(int) obj;
				System.out.println(i);
				
			}
			else if(obj instanceof String)
			{
				String s=(String) obj;
				System.out.println(s);
				
			}
			else
			{
				System.out.println(obj);
			}
		}
		
	}

}
