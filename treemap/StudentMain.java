package com.treemap;

import java.util.Set;
import java.util.TreeMap;

//Insert student using Comparable

public class StudentMain {
	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(101);
		s.setSname("Rahul");
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("Sachin");
		
		TreeMap t=new TreeMap();
		t.put(s, "Student1");
		t.put(s1, "Student2");
		
		System.out.println(t);
	

	}

}
