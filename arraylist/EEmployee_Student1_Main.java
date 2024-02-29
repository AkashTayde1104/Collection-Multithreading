package com.arraylist;

public class EEmployee_Student1_Main {
	public static void main(String[] args) {
		Address adrs=new Address();
		adrs.setAreaName("Moshi");
		adrs.setCityName("Pune");
		
		Address adrs1=new Address();
		adrs1.setAreaName("College Road");
		adrs1.setCityName("Nashik");
		
		System.out.println("---student s-----");
		Student1 s=new Student1();
		s.setSid(101);
		s.setSname("Rahul");
		s.setaddress(adrs);
		
		System.out.println(s);
		
		System.out.println("---student s1-----");
		Student1 s1=new Student1();
		s1.setSid(102);
		s1.setSname("Ram");
		s1.setaddress(adrs);
		
		System.out.println(s1);
		
		System.out.println("---student s2-----");
		Student1 s2=new Student1();
		s2.setSid(103);
		s2.setSname("Rakesh");
		s2.setaddress(adrs);
		
		System.out.println(s2);
		
		System.out.println();
		System.out.println("____________student adrs1___________________");
		
		System.out.println("---student s3-----");
		Student1 s3=new Student1();
		s3.setSid(104);
		s3.setSname("Ritesh");
		s3.setaddress(adrs1);
		System.out.println(s3);
		
		System.out.println("---student s4-----");
		Student1 s4=new Student1();
		s4.setSid(105);
		s4.setSname("Ravi");
		s4.setaddress(adrs1);
		System.out.println(s4);
		
		System.out.println("---student s5-----");
		Student1 s5=new Student1();
		s5.setSid(106);
		s5.setSname("Rohit");
		s5.setaddress(adrs1);
		System.out.println(s5);
		
		System.out.println();
		System.out.println("_________using array__________________");
		System.out.println("____________Employee Data_________");
		
		EEmployee E1=new EEmployee();
		E1.setEid(101);
		E1.setEname("Suraj");
		E1.setEmailid("suraj@123");
		E1.setaddress(adrs);
		E1.setSlary(40000);
		
		EEmployee E2=new EEmployee();
		E2.setEid(102);
		E2.setEname("Ram");
		E2.setaddress(adrs);
		E2.setEmailid("Ram@123");
		E2.setSlary(50000);
	
	    EEmployee E3=new EEmployee();
		E3.setEid(103);
		E3.setEname("Rajesh");
		E3.setEmailid("Rajesh@123");
		E3.setaddress(adrs1);
		E3.setSlary(65000);
		
		EEmployee E4=new EEmployee();
		E4.setEid(104);
		E4.setEname("Vicky");
		E4.setEmailid("Vicky@123");
		E4.setaddress(adrs1);
		E4.setSlary(25000);
		
		EEmployee emp[]= {E1, E2, E3,E4};
		for(EEmployee E:emp)
		{
			System.out.println(E); 
			System.out.println("_____________");
		}
		
	}

}
