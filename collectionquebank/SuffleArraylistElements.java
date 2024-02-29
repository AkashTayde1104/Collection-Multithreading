package com.collectionquebank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SuffleArraylistElements {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Monday");
		l.add("Tuesday");
		l.add("Wednsday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Saturday");
		
		System.out.println(l);
		System.out.println("_______Before Shuffling________");
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("_____After Shuffling________");
		System.out.println();
		Collections.shuffle(l);
		
		System.out.println(l);
		System.out.println();
		Iterator itr1=l.iterator();
		while(itr1.hasNext()) 
		{
			String s1=(String)itr1.next();
			System.out.println(s1);
		}
		
	}

}
