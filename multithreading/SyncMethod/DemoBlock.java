package com.multithreading.SyncMethod;

public class DemoBlock {
	public static void main(String [] args)
	{
		SyncBlock s=new SyncBlock();
	MyThreadBlock t=new MyThreadBlock(s,2);
	MyThreadBlock t1=new MyThreadBlock(s,4);
	MyThreadBlock t2=new MyThreadBlock(s,6);
	MyThreadBlock t3=new MyThreadBlock(s,8);
	t1.start();
	t.start();
	t2.start();
	t3.start();
	
	
	
	}
}
