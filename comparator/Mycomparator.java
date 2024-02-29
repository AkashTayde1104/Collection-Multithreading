package com.comparator;

import java.util.Comparator;

public class Mycomparator implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
//		return I1.compareTo(I2);//Ascending order
//		return -I1.compareTo(I2);//Descending order
//		return I2.compareTo(I1);//Descending order
//		return -I2.compareTo(I1);//Ascending order
//		return 1;//Insertion order
		//return -1;//Reverse of Insertion order
		//return 0;//only first element will be inserted
		if(I1>I2)
		{
			return -1;//descending order
		}
		else if(I1<I2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
		// or
//		
//		if(I1<I2)
//		{
//			return -1;//Ascending order
//		}
//		else if(I1>I2)
//		{
//			return 1;
//		}
//		else
//		{
//			return 0;
//		}
	}
	

}
