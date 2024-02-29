package com.comparable;

import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		
		
		TreeSet t=new TreeSet();
		t.add("B");
		t.add("K");
		t.add("D");
		t.add("Z");
		System.out.println(t);
		
		TreeSet tT=new TreeSet();
		tT.add("S");
		tT.add("L");
		tT.add("W");
		tT.add("R");
		System.out.println(tT);
	}


}
