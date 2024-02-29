package com.hashset;

import java.util.HashSet;

public class Demo {
public static void main(String[] args) {
	HashSet h=new HashSet();
		h.add(10);
		h.add(40);
		h.add(20);
		h.add(50);
		h.add(30);
		System.out.println(h.add(10));
		h.add("Ram");
		h.add(null);
		System.out.println(h);
}
}
