package com.multithreading;

public class MyThread_Yeild extends Thread{
	@Override
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			Thread.yield();// pause child thread and give chance to main thread to execute first
			System.out.println("Child Thread");
		}
	}

}
