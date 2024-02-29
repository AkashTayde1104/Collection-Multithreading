package com.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Demo {
	public static void main(String[] args) {
		List l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
		l.add(i);
		}
		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			Integer x = itr.next();
			if(x%2==0)
			{
				System.out.println(x);//even number
			}
			else
			{
				itr.remove();//remove no. except even no.
			}
		}
		System.out.println(l);
	}

}
