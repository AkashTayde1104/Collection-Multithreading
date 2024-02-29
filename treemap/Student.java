package com.treemap;

// Insert student using Comparable

public class Student implements Comparable {
	int Sid;
	String Sname;
	

	public int getSid() {
		return Sid;
	}


	public void setSid(int sid) {
		Sid = sid;
	}


	public String getSname() {
		return Sname;
	}


	public void setSname(String sname) {
		Sname = sname;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}


	@Override
	public String toString() {
		return "[Sid=" + Sid + ", Sname=" + Sname +"]";
	}

}
