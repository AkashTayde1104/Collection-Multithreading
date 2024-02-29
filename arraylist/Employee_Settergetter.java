package com.arraylist;

public class Employee_Settergetter {
	private int Eid;
	private String Ename;
	private double Salary;
	private String Address;
	private String Emailid;
	
	public void setEid(int Eid)
	{
		this.Eid=Eid;
	}
	public int getEid()
	{
		return Eid;
	}
	
	
	public void setEname(String Ename)
	{
		this.Ename=Ename;
	}
	public String getEname()
	{
		return Ename;
	}
	
	
	public void setSlary(double Salary)
	{
		this.Salary=Salary;
	}
	public double getSalary()
	{
		return Salary;
	}
	
	
	public void setaddress(String Address)
	{
		this.Address=Address;
	}
	public String Getaddress()
	{
		return Address;
	}
	
	public void setEmailid(String Emailid)
	{
		this.Emailid=Emailid;
	}
	public String getEmailid()
	{
		return  Emailid;
	}
	@Override
	public String toString() {
		return " Eid=" + Eid + "\n Ename=" + Ename + "\n Salary=" + Salary + "\n Address=" + Address
				+ "\n Emailid=" + Emailid ;
	}
	
	

}
