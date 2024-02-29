package com.treemap;

import java.util.TreeMap;

//insert stringBuffer element in Alphabet order

public class StringBufffer_Element {
	
	public static void main(String[] args) {
		TreeMap t=new TreeMap(new MyComparator_StringBuffer());
		t.put(new StringBuffer("Sachin"), 102);
		t.put(new StringBuffer("Amol"), 101);
		t.put(new StringBuffer("Rakesh"), 104);
		t.put(new StringBuffer("Piyush"), 103);
		
		System.out.println(t);
	}

}
