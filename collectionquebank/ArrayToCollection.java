package com.collectionquebank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToCollection {
	
	public static void main(String[] args) {
		int a;
		String Sample_Array[]= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
//		for(a=0;a<Sample_Array.length;a++)
//		{
//			System.out.println(Sample_Array[a]);//retriving array
//		}
		
		List<String> l=new ArrayList();
		Collections.addAll(l, Sample_Array);//using collections.addAll(collection,Array); array will be added to list
	
		System.out.println(l);
		
		//or
//		List l1=new ArrayList();
//		l1.add(Sample_Array);
//		System.out.println(l1);
	}

}
