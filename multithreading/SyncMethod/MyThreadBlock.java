package com.multithreading.SyncMethod;

public class MyThreadBlock extends Thread {
	SyncBlock s;
	int n;
	
	public MyThreadBlock(SyncBlock s, int n) {
		
		this.s = s;
		this.n=n;
	}


	@Override
	public void run()
	{
		s.printTable(n);
	}
	

}
