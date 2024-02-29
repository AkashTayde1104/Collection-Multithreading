package com.multithreading.SyncMethod;

public class SyncBlock_Run_Imp_Runnable implements Runnable {
	SyncBlock_Imp_Runnable s;
	String name;
	public SyncBlock_Run_Imp_Runnable(SyncBlock_Imp_Runnable s, String name) {
		
		this.s = s;
		this.name = name;
	}
	@Override
	public void run() {
//		synchronized(s)//get lock of particular object
		synchronized(SyncBlock_Imp_Runnable.class)//get class level lock
		{
		s.cricketerName(name);
		}
		
	}
	
	
	

}
