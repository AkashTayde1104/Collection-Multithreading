package com.comparable;

public class MyComparable implements Comparable {
//error
	@Override
	public int compareTo(Object o) {
		o.toString();
		return 0;
	}

}
