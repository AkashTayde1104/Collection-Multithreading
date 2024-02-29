package com.multithreading.SyncMethod;

public class StaticDemo {
	public static void main(String[] args) {
		//StaticSyncTest s =new StaticSyncTest();
		StaticMyThread t1=new StaticMyThread(1);
		StaticMyThread t2=new StaticMyThread(2);
		StaticMyThread t3=new StaticMyThread(10);
		StaticMyThread t4=new StaticMyThread(100);
//		StaticMyThread t5=new StaticMyThread();
//		StaticMyThread t6=new StaticMyThread();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
//		t5.start();
//		t6.start();
	}

}
