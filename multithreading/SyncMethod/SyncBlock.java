package com.multithreading.SyncMethod;

public class SyncBlock {

	public void printTable(int n) {
		
		synchronized (this)//to get lock of current object using synchronized block....use this keyword
		{
			for (int i = 1; i <= 10; i++) {
				System.out.print(n * i + " ");
			}
			System.out.println();//for next line
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				System.out.println("print table is successfully printed");
				System.out.println("thank you");
		}
		
		System.out.println("___________________________");
		System.out.println("Next table");
		System.out.println();


		

	}
}
