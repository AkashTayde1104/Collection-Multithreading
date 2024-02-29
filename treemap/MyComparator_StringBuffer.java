package com.treemap;

import java.util.Comparator;

//insert stringBuffer element in Alphabet order

public class MyComparator_StringBuffer implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s1.compareTo(s2);
	}

}
