package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hashamap_Asignments {
	public static void main(String[] args) {
		List<String> MH=new ArrayList();
		MH.add("Pune");
		MH.add("Nashik");
		
		List<String> GJ=new ArrayList();
		GJ.add("Surat");
		GJ.add("Ahmadabad");
		
		Map<String, List<String>> h=new HashMap();
	    h.put("Maharashtra", MH);
	    h.put("Gujrat", GJ);
	    
	    System.out.println(h);
	    
	    Set<String> keys = h.keySet();
	    System.out.println(keys);
	    
	    System.out.println("__________itrator________________");
	    Iterator<String>itr = keys.iterator();
	    while(itr.hasNext())
	    {
	    	String key = itr.next();
	    	System.out.println(key);
	    	
	    	List<String> value = h.get(key);
	    	System.out.println(value);
	    	
	    	Iterator<String> itr2 = value.iterator();
	    	while(itr2.hasNext())
	    	{
	    		String val = itr2.next();
	    		
		    	System.out.println(val);
	    	}
	    	
	    }
	    
	    System.out.println("___________For each loop_________________");
	    for(String k:keys)
	    {
	    	System.out.println(k);
	    	List<String> value1 = h.get(k);
	    	System.out.println(value1);
	    	
	    	for(String v:value1)
	    	{
	    		System.out.println(v);
	    	}
	    }
		
		
		
	}

}
