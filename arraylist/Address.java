package com.arraylist;

public class Address {
	private String AreaName;
	private String CityName;
	
	public void setAreaName(String AreaName)
	{
		this.AreaName=AreaName;
	}
	public String GetAreaName()
	{
		return AreaName;
	}
	
	public void setCityName(String CityName)
	{
		this.CityName=CityName;
	}
	public String GetCityName()
	{
		return CityName;
	}
	@Override
	public String toString() {
		return " AreaName=" + AreaName + "\n CityName=" + CityName +"\n" ;
	}

}
