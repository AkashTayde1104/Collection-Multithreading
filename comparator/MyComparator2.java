package com.comparator;

import java.util.Comparator;

public class MyComparator2 implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
//		StringBuffer s1=(StringBuffer)obj1;
//		StringBuffer s2=(StringBuffer)obj2;
		
//		return s1.toString().compareTo(s2.toString());//Alphabetical order
		
//		// or
//		String ss1=new String(s1);
//		String ss2=new String (s2);
//		
//		return ss2.compareTo(ss1);//Alphabetical reverse order
		//return -ss1.compareTo(ss2);//Alphabetical reverse order
		
		//or
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}

}
