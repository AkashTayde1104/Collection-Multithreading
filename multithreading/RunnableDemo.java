package com.multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		Thread t1=new Thread();
		//t1.start();//new thread create & execute thread class run()
		//t1.run();// no thread create & run() execute as a normal
		//t.start();//new thread create & execute MyRunnable class run()
		//t.run();//no thread create & MyRunnable  run() execute as a normal
		//r.run();//no thread create & MyRunnable run() execute as a normal
		//r.start();//compile error
		for(int i=0;i<=3;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
