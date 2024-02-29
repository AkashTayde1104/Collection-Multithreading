package com.weakhashmap;

public class Temp {
	public String toString()
	{
		return "temp";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Finalize() called");
	}

}
