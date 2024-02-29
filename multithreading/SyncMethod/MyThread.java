package com.multithreading.SyncMethod;

public class MyThread extends Thread {
	
	SyncTest st;
	String name;
	public MyThread(SyncTest st, String name) {
		
		this.st = st;
		this.name = name;
	}
	
	@Override
	public void run()
	{
		st.cricketerName(name);
	}
	
}
