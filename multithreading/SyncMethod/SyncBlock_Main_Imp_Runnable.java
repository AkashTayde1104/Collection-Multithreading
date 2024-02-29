package com.multithreading.SyncMethod;

public class SyncBlock_Main_Imp_Runnable {
public static void main(String[] args) {
	
	SyncBlock_Imp_Runnable s=new SyncBlock_Imp_Runnable();
	
	SyncBlock_Run_Imp_Runnable s1=new SyncBlock_Run_Imp_Runnable(s,"Sachin Tendulakar");
	SyncBlock_Run_Imp_Runnable s2=new SyncBlock_Run_Imp_Runnable(s,"Mahendrasing Dhoni");
	SyncBlock_Run_Imp_Runnable s3=new SyncBlock_Run_Imp_Runnable(s,"Virat Kohli");
	
	new Thread(s1).start();
	new Thread(s2).start();
	new Thread(s3).start();
	
}
}
