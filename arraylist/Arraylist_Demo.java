
package com.arraylist;

import java.util.ArrayList;

public class Arraylist_Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(40);
		l.add("tech");
		l.add('c');
		l.add(10);
		System.out.println(l);
		
		Object remove = l.remove(1);
		System.out.println(remove);//return removed object
		System.out.println(l);//after remove
		
		l.add(0, 100);
		System.out.println(l);
		
		Object set = l.set(0, 200);
		System.out.println(set);//return old object which replace to new object
		System.out.println(l);//after set new object
		
	}

}
