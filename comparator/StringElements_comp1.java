package com.comparator;

import java.util.TreeSet;

public class StringElements_comp1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Rahul");
		t.add("Suraj");
		t.add("Amol");
		t.add("Dilip");
		System.out.println(t);
	}

}
