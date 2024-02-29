package com.collectionquebank;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class DisplayHashTableContentsUsingnEnumeration {
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put("SAchin", 101);
		h.put("Ravi", 103);
		h.put("Ritesh", 102);
		h.put("Amol", 104);
		
		System.out.println(h);
		
		Enumeration key=h.keys();//returns enumeration of the keys in hashtable
		//System.out.println(key);
		
		//Enumeration enu=key.elements();
		while(key.hasMoreElements())
		{
			String keys = (String)key.nextElement();
			System.out.println(keys);
			Object object = h.get(keys);
			System.out.println(object);
		}
		
	}

}
