package com.comparable;

import java.util.TreeSet;
//error
public class SttringBuffer_Comparable implements Comparable {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(new StringBuffer("Jay"));
	t.add(new StringBuffer("Amol"));
	t.add(new StringBuffer("Rakesh"));
	t.add(new StringBuffer("Bharat"));
	System.out.println(t);
}

@Override
public int compareTo(Object o) {
	o.toString();
	return 1;
}
}
