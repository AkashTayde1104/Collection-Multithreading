package com.arraylist;

public class Employee_Settergetter_Main {
	public static void main(String[] args) {
		
		Employee_Settergetter E1=new Employee_Settergetter();
		E1.setEid(101);
		E1.setEname("Suraj");
		E1.setEmailid("suraj@123");
		E1.setaddress("Moshi");
		E1.setSlary(40000);
		
		System.out.println(E1);
		System.out.println();
		
		Employee_Settergetter E2=new Employee_Settergetter();
		E2.setEid(102);
		E2.setEname("Ram");
		E2.setaddress("Nashik");
		E2.setEmailid("Ram@123");
		E2.setSlary(50000);
		
		System.out.println(E2);
		System.out.println();
	
		Employee_Settergetter E3=new Employee_Settergetter();
		E3.setEid(103);
		E3.setEname("Rajesh");
		E3.setEmailid("Rajesh@123");
		E3.setaddress("Pune");
		E3.setSlary(65000);
		
		System.out.println(E3);
		System.out.println();
		
		Employee_Settergetter E4=new Employee_Settergetter();
		E4.setEid(104);
		E4.setEname("Vicky");
		E4.setEmailid("Vicky@123");
		E4.setaddress("Yeola");
		E4.setSlary(25000);
		
		System.out.println(E4);
		System.out.println();
	}

}
