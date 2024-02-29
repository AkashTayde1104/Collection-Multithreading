package com.identityhashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo {
public static void main(String[] args) {
//	HashMap h=new HashMap();//use equals() for contain comparison
//	Integer I1=new Integer(10);
//	Integer I2=new Integer(10);
//	h.put(I1,"Sachin");
//	h.put(I2, "Rahul");
//	
//	System.out.println(h);
	
	
	IdentityHashMap h=new IdentityHashMap();//use ==to operator for reference comparison
	Integer I1=new Integer(10);
	Integer I2=new Integer(10);
	h.put(I1,"Sachin");
	h.put(I2, "Rahul");
	
	System.out.println(h);
}
}
