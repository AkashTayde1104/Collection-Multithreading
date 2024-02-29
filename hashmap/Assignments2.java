package com.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignments2 {
	public static void main(String[] args) {
		List<String> MH=new LinkedList();
		MH.add("Pune");
		MH.add("Nashik");
		
		Set<String> GJ=new HashSet();
		GJ.add("Surat");
		GJ.add("Ahmdabad");
		
		Map India=new HashMap();
		India.put("List", MH);
		India.put("Set", GJ);
		System.out.println(India);
		
		Set<String> key = India.keySet();
		System.out.println(key);
		
		Iterator<String> itr=key.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);
		
            Object val =India.get(s);
            System.out.println(val);
            
        if(val instanceof List)
        {
        	List l1 =(List)val;
        	Iterator itr1=l1.iterator();
        	while(itr1.hasNext())
        	{
        		String str=(String)itr1.next();
        		System.out.println(str);
        	}
        	
        }
        else if(val instanceof Set)
        {
        	Set s1=(Set)val;
        	Iterator itr2=s1.iterator();
        	while(itr2.hasNext())
        	{
        		String str1=(String)itr2.next();
        		System.out.println(str1);
        	}
        }
		}
        
       System.out.println();
       System.out.println("_________using for each loop__________");
        
        for(String k:key)
        {
        	System.out.println(k);
        	
        	Object obj=India.get(k);
        	System.out.println(obj);
        	
        	if(obj instanceof List)
            {
            	List<String> l11 =(List)obj;
            	for(String v:l11)
            	{
            		System.out.println(v);
            		
            	}
            		
            	}
        	  else if(obj instanceof Set)
              {
              	Set<String> s11=(Set)obj;
              	for(String v1:s11)
              	{
              		System.out.println(v1);
              	}
        }
	
		
            
        }
		
	

	}
}
