package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Arraylist_Employee_Main {
public static void main(String[] args) {
		
		Address adrs=new Address();
		adrs.setAreaName("Moshi");
		adrs.setCityName("Pune");
		
		Address adrs1=new Address();
		adrs1.setAreaName("College Road");
		adrs1.setCityName("Nashik");
		
		Employee E1=new Employee();
		E1.setEid(101);
		E1.setEname("Suraj");
		E1.setEmailid("suraj@123");
		E1.setaddress(adrs);
		E1.setSlary(40000);
		
		Employee E2=new Employee();
		E2.setEid(102);
		E2.setEname("Ram");
		E2.setaddress(adrs);
		E2.setEmailid("Ram@123");
		E2.setSlary(50000);
	
	    Employee E3=new Employee();
		E3.setEid(103);
		E3.setEname("Rajesh");
		E3.setEmailid("Rajesh@123");
		E3.setaddress(adrs1);
		E3.setSlary(65000);
		
		Employee E4=new Employee();
		E4.setEid(104);
		E4.setEname("Vicky");
		E4.setEmailid("Vicky@123");
		E4.setaddress(adrs1);
		E4.setSlary(25000);
		
		List EmpList=new ArrayList();
		EmpList.add(E1);
		EmpList.add(E2);
		EmpList.add(E3);
		EmpList.add(E4);
		
		System.out.println(EmpList);
		
		System.out.println();
		System.out.println("________________for Each loop___________________________");
		
		//Using for Each loop
		
		for(Object EL:EmpList)
		{
			System.out.println(EL);
		}
		
		System.out.println();
		System.out.println("________________Iterator____________________________");
		//Using Iterator
		
		Iterator<Employee> itr = EmpList.iterator();
		while(itr.hasNext())
		{
			Employee Emp = itr.next();
			System.out.println(Emp);
		}
	}

}



