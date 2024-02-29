package com.failfastfailsafeiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		List<String> l=new CopyOnWriteArrayList<String>();
		l.add("Ram");
		l.add("Sachin");
		l.add("Rahul");
		System.out.println(l);
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			l.add("Ramesh");
		}
		System.out.println(l);
		
	}


}
