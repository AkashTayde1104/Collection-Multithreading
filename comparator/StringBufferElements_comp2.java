package com.comparator;

import java.util.TreeSet;

public class StringBufferElements_comp2 {
	public static void main(String[] args) {
	TreeSet t=new TreeSet(new MyComparator2());
	t.add(new StringBuffer("Rani"));
	t.add(new StringBuffer("Moni"));
	t.add(new StringBuffer("Amol"));
	t.add(new StringBuffer("Dipa"));
	System.out.println(t);
}


}
