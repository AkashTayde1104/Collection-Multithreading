package com.vector;

import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		int i;
		Vector v=new Vector();
		System.out.println(v.capacity());
		
		for(i=0;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
System.out.println(v.capacity());

v.addElement("Tech");
System.out.println(v);

v.removeElement(1);
System.out.println(v);


System.out.println(v.elementAt(5));

System.out.println(v.firstElement());

System.out.println(v.lastElement());

System.out.println();

System.out.println(v.size());

v.clear();
System.out.println(v);
System.out.println(v.size());
}

}
