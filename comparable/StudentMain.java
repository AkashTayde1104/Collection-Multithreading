package com.comparable;

import java.util.TreeSet;

public class StudentMain {
	public static void main(String[] args) {
		Student s=new Student();
		s.setSid(101);
		s.setSname("Rahul");
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("Sachin");
		
		TreeSet t=new TreeSet();
		t.add(s);
		t.add(s1);
		System.out.println(t);
	}

}
