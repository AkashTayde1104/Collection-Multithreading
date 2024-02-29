package com.multithreading.SyncMethod;

public class StaticMyThread extends Thread {
	int n;
	StaticSyncTest st;
	

	public StaticMyThread(int n) {
		
		this.n = n;
	}
	
//	public StaticMyThread()
//	{
//		
//	}
	
	
	@Override
	public void run()
	{
		StaticSyncTest.printTable(n);
//		st.man();
//		st.wish();
	}
	
	

}
