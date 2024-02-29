package com.multithreading.SyncMethod;

public class SyncBlock_Imp_Runnable {
	public void cricketerName(String name)
	{
		//synchronized(this)//get lock of current object
		//{
			System.out.println(name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("next");
		//}
		
	}

}
