package com.multithreading.SyncMethod;

public class StaticSyncTest {
	
	public static synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println();
	}
	
//	public synchronized void wish()
//	{
//		System.out.println("wish()");
//		
//	}
//	
//	public void man()
//	{
//		System.out.println("man");
//	}

}
