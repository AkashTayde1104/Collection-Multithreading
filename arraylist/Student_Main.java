package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Student_Main {
	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(101);
		s.setSname("Rahul");
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("Ram");
			
		Student s2=new Student();
		s2.setSid(103);
		s2.setSname("Rakesh");
		
		List StudenList =new ArrayList();
		StudenList.add(s);
		StudenList.add(s1);
		StudenList.add(s2);
		System.out.println(StudenList);
		
		System.out.println("__________using for each loop_____________");
		
		for(Object SL:StudenList)
		{
			System.out.println(SL);
		}
		
		System.out.println("_____________using iterator__________");
		
		Iterator iterator=StudenList.iterator();
		while(iterator.hasNext())
		{
			Student sl = (Student)iterator.next();
			System.out.println(sl);
		}
	}
	

}
