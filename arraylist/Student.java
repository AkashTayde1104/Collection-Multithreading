package com.arraylist;

public class Student {

		private int Sid;
		private String Sname;
		
		public void setSid(int Sid)
		{
			this.Sid=Sid;
		}
		
		public int getSid()
		{
			return Sid;
					
		}
		
		public void setSname(String Sname)
		{
			this.Sname=Sname;
		}
		
		public String getSname()
		{
			return Sname;
		}

		@Override
		public String toString() {
			return "Sid=" + Sid + ", Sname=" + Sname;
		}
		

}

