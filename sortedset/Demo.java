package com.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(100);
		s.add(102);
		s.add(104);
		s.add(105);
		s.add(108);
		s.add(110);
		s.add(111);
		s.add(115);
		
		System.out.println(s);
		
		System.out.println(s.first());
		
		System.out.println(s.last());
		
		System.out.println(s.headSet(105));
		
	System.out.println(s.tailSet(110));
	
		System.out.println(s.subSet(102, 115));
	}

}
