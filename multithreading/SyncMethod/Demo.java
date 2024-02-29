package com.multithreading.SyncMethod;

public class Demo {
	public static void main(String[] args) {
		SyncTest s=new SyncTest();
	MyThread t1=new MyThread(s, "Sachin Tendulkar");
	MyThread t2=new MyThread(s, "Virat Kohli");
	MyThread t3=new MyThread(s, "Rahul Sharma");
	t1.start();
	t2.start();
	t3.start();
	
	}
}
