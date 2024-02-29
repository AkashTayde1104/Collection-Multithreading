package com.treemap;

import java.util.TreeMap;

//insert string element in reverse of Alphabet

public class StringElements {
	public static void main(String[] args) {
		
		TreeMap t=new TreeMap(new MyComparator_String());
		t.put("Sachin", 101);
		t.put("Rahul", 105);
		t.put("Amol", 102);
		t.put("Ravi", 104);
		t.put("Bharat", 103);
		
		System.out.println(t);
	}

}
