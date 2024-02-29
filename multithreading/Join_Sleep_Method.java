package com.multithreading;

public class Join_Sleep_Method {
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		t.join();//after completion of child thread then only main execute
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(2000);//stop execution for some time
			System.out.println("Main thread");
		}
	}

}
