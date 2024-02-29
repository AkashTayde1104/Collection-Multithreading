package com.multithread.syncblock;

public class MyThread  extends Thread {
	String msg;
	SyncBlock s;
	public MyThread(String msg, SyncBlock s) {
		
		this.msg = msg;
		this.s = s;
	}
	
	@Override
	public void run()
	{
	synchronized(s)//to get lock of particular object using synchronized block...pass object reference
	{
	s.SendMsg(msg);
	}
	
//	synchronized(SyncBlock.class)//to get lock of class level using synchronized block.... directly classname.class
//	{
//	s.SendMsg(msg);
//	}
	
//s.SendMsg(msg);//at a time both threads are called.....normal method or non synchronized method
	
	System.out.println("____________");
	}
	

}
