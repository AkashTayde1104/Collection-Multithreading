package com.multithreading;

public class Get_Set_Thread_Name {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.currentThread().getName());
		MyThread t1=new MyThread();
		System.out.println(t1.getName());
		t.currentThread().setName("New Main");//set current thread
		System.out.println(t.currentThread().getName());//get child thread
		t1.setName("new Child");//set child thread
		System.out.println(t1.getName());//get child thread
		
	}

}
