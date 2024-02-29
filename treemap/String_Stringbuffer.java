package com.treemap;

import java.util.TreeMap;

//Insert string and stringBuffer using increasing length order

public class String_Stringbuffer {
	public static void main(String[] args) {
		TreeMap t=new TreeMap(new MyComparator_S_Sb());
		t.put(new StringBuffer("Sachin"), 101);
		t.put("Ravi", 102);
		t.put(new StringBuffer("Rahul"), 103);
		t.put("Amol", 104);
		t.put(new StringBuffer("Ramesh"), 105);
		
		System.out.println(t);
		
		
		
	}

}
