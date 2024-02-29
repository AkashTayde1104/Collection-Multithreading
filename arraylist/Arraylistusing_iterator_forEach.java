package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistusing_iterator_forEach {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(11);
		l.add(10);
		l.add(20);
		l.add('k');
		l.add("tech");
		System.out.println(l);
		
		System.out.println("_____iterator____________");
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		System.out.println("________using for each____________");
		for(Object Sl:l)
		{
			System.out.println(Sl);
		}
	}

}
