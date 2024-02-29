package com.multithreading;

public class MyThread22 extends Thread{
	//StaticSyncTest33 sst;
	String name;
	 int rollno;
	public MyThread22(String name, int rollno) {
		
		//this.sst = sst;
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public void run()
	{
	StaticSyncTest33.student(name, rollno);//static method so called using classname
	}
	

}
