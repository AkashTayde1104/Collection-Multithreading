package com.failfastfailsafeiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Ram");
		l.add("Sachin");
		l.add("Rahul");
		System.out.println(l);
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
			l.remove(2);
		}
		
	}

}
