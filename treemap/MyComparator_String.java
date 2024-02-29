package com.treemap;

import java.util.Comparator;

//insert string element in reverse of Alphabet

public class MyComparator_String implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}

}
