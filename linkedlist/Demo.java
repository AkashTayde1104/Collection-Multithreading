package com.linkedlist;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		
	
	LinkedList l=new LinkedList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add("Jay");
	l.add("Sachin");
	l.add(null);
	l.add(10);
	System.out.println(l);
	
	Object set = l.set(2, "Rahul");
	System.out.println(set);
	System.out.println(l);
	
	l.add(1, 500);
	System.out.println(l);
	
	l.addFirst(1000);
	System.out.println(l);
	
	l.addLast(2000);
	System.out.println(l);
	
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
	
	l.removeFirst();
	System.out.println(l);
	
    l.removeFirstOccurrence(10);
    System.out.println(l);
	
	

}
}