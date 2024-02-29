package com.multithreading;

public class MyThread extends Thread
{
	
	@Override
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("Child Thread");
		}
		
	}
	
//	public void run(int x)
//	{
//		
//		{
//			System.out.println("overloaded run()");
//		}
//		
//	}
	
//	public void start()
//	{
//		System.out.println("start()");
//	}

}
