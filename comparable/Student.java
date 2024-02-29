package com.comparable;

public class Student implements Comparable{
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + "]";
	}


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
	
		return 0;//[Student [Sid=101, Sname=Rahul]]
		//return -1;//[Student [Sid=102, Sname=Sachin], Student [Sid=101, Sname=Rahul]]
	//	return 1;// [Student [Sid=101, Sname=Rahul], Student [Sid=102, Sname=Sachin]]
	}


	
	

}
