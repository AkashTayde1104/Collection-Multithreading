package com.comparator;

import java.util.TreeSet;

public class String_StringBuffer_comp3 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator3());
		t.add(new StringBuffer("Sachin"));
		t.add("Ramesh");
		t.add(new StringBuffer("Amol"));
		t.add("Rahul");
		t.add(new StringBuffer("Ram"));
		t.add(new StringBuffer("Vishal"));
		t.add("Anil");
		System.out.println(t);
	}

}
