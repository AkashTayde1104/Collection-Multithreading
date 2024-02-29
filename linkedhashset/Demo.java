package com.linkedhashset;

import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
		s.add(10);
		s.add(40);
		s.add(100);
		s.add('c');
		s.add("Hello");
		s.add(20);
		s.add(10);
		
		System.out.println(s);//insertion order preserve and duplicate not allowed
		
	}

}
