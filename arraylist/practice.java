package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//Arraylist read only
public class practice {
	public static void main(String[] args) {

		ArrayList a1=new ArrayList();
		a1.add("Amol");
		a1.add("Amol");
		a1.add("Roshan");
		a1.add("Amol");

		System.out.println("arraylist with duplicates");
		System.out.println(a1);
	
		System.out.println();
		System.out.println("arraylist read only");
		List unmodifiableList = Collections.unmodifiableList(a1);
		System.out.println(a1);
		
		System.out.println();
		System.out.println("Arraylist without duplicates");
		Set s=new LinkedHashSet(a1);
		ArrayList a=new ArrayList(s);
		System.out.println(a);
		
	}

}
