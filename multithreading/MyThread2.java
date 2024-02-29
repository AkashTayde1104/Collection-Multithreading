package com.multithreading;

public class MyThread2 extends Thread {
	String name;
	SyncTest3 st;
	
	public MyThread2(SyncTest3 st, String name) {
		
		this.name = name;
		this.st = st;
	}

	@Override
	public void run()
	{
		st.wish(name);//non static method so need to call using reference
	}

}
