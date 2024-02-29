package com.comparator;

import java.util.Comparator;

public class MyComparator1 implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		String I1=(String)obj1;
		String I2=(String)obj2;
		
		return I2.compareTo(I1);
	}

}
