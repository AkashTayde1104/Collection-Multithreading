package com.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Demo {
	public static void main(String[] args) {
		Vector v=new Vector();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		Enumeration ele = v.elements();
		while(ele.hasMoreElements())
		{
			Object obj = ele.nextElement();
			System.out.println(obj);
		}
		System.out.println("_______________________________________________");
		
		//or
		
		Enumeration ele1 = v.elements();
		while(ele1.hasMoreElements())
		{
			Integer i=(Integer)ele1.nextElement();
			if(i%2==0)
			{
				System.out.println(i);//Even number
			}
			
		
		}
		System.out.println("________________________________________________");
		
		//or
		
		Enumeration ele2 = v.elements();
		while(ele2.hasMoreElements())
		{
			Integer i=(Integer)ele2.nextElement();
			if(i%2!=0)
			{
				System.out.println(i);//odd number
			}
			
		
		}
	}

}
