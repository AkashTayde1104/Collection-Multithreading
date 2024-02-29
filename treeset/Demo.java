package com.treeset;

import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
	    t.add(10);
	    t.add(20);
	    t.add(5);
	    t.add(40);
	    t.add(50);
	   // t.add(null);//nullpointerException
	   // t.add("Hello");//Class cast Exception
	    System.out.println(t);
	
	}

}
