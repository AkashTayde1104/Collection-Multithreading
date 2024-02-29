package com.multithread.syncblock;

public class SyncBlock {
	public void SendMsg(String msg)
	{
		System.out.println("Sending msg: "+ msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sent");
	}

}
