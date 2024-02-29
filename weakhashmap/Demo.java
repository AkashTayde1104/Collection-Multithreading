package com.weakhashmap;

import java.util.HashMap;
import java.util.WeakHashMap;



public class Demo {
	public static void main(String[] args) throws InterruptedException {
//		WeakHashMap h=new WeakHashMap();
//		Temp t=new Temp();
//		h.put(t, "Sachin");
//		System.out.println(h);
//		
//		t=null;
//		System.gc();
//		Thread.sleep(2000);
//		System.out.println(h);//gc dominate weakhashmap
		
		HashMap h=new HashMap();
		Temp t=new Temp();
		h.put(t, "Sachin");
		System.out.println(h);
		
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(h);//hashmap dominate gc
	}

}
