package com.multithreading;

public class StaticSyncTest33 {
	public static synchronized void student(String name, int rollno)
	{
		
			System.out.println("Student information: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name +"="+ rollno);
			
		
	}

	
}
