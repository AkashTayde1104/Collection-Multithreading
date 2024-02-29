package com.treemap;

import java.util.Iterator;
import java.util.Scanner;

//sort id, name, salary using comparator

import java.util.Set;
import java.util.TreeMap;

public class EmployeMain {
	public static void main(String[] args) {
		TreeMap<Employe, String> t=null;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter you choice");
		System.out.println("1. Id sort \n2. Name Sort \n3. Salary Sort");
		int x=sc.nextInt();
		
		switch(x)
		{
		case 1:
			t=new TreeMap(new IdSortComparator());
			
			break;
			
		case 2:
			t=new TreeMap(new NameSortComparator());
			
			break;
			
		case 3:
			t=new TreeMap(new SalarySortComparator());
			break;
			
		}
		
		Employe e1=new Employe();
		e1.setSid(101);
		e1.setSname("Ramesh");
		e1.setSalary(30000);
		
		Employe e2=new Employe();
		e2.setSid(102);
		e2.setSname("Amol");
		e2.setSalary(20000);
		
		Employe e3=new Employe();
		e3.setSid(103);
		e3.setSname("Sachin");
		e3.setSalary(25000);
		
		t.put(e1, "Employe 1");
		t.put(e2, "Employe 2");
		t.put(e3, "Employe 3");
		
		Set<Employe> key = t.keySet();
		System.out.println();
		
		for(Employe emp:key)
		{
			
			System.out.println(emp.getSid());
			System.out.println(emp.getSname());
			System.out.println(emp.getSalary());
			String val=t.get(emp);
			System.out.println(val);
			System.out.println("_____________");
			
		}
		
		
//		Iterator<Employe> itr = key.iterator();
//		while(itr.hasNext())
//		{
//			Employe keys = itr.next();
//			System.out.println(keys.getSid());
//			System.out.println(keys.getSname());
//			System.out.println(keys.getSalary());
//			String val1=t.get(keys);
//			System.out.println(val1);
//		}
		
		
		}
	}

}
