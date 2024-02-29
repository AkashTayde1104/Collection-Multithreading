package com.multithread.syncblock;

public class Demo {
public static void main(String[] args) {
	

	SyncBlock s=new SyncBlock();
	MyThread t=new MyThread("Hello", s);
	MyThread t1=new MyThread("Welcome to java", s);
	t.start();
	t1.start();
	
	

}
}
