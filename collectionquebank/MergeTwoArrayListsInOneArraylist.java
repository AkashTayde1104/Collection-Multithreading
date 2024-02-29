package com.collectionquebank;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class MergeTwoArrayListsInOneArraylist {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add("Amol");
		a1.add("Ravi");
		a1.add("Roshan");
		a1.add("Ramesh");
		
		System.out.println("First Arraylist: "+a1);
		
		ArrayList a2=new ArrayList();
		a2.add(111);
		a2.add(112);
		a2.add(113);
		a2.add(114);
		
		System.out.println("Second ArrayList: "+a2);
		
		a1.addAll(a2);//Merge 2 Arraylist
		System.out.println("Combined ArrayList: "+a1);
		
        a1.removeAll(a2);//remove 1 arraylist
        System.out.println("Remove second Arraylist : "+a1);
        
        //or merge 2 Arraylist in separate Arraylist
        ArrayList A=new ArrayList(a1);
        A.addAll(a2);
        System.out.println("Merge 2 Arraylist in 3rd Arraylist: "+A);
        
        //or merge 2 Arraylist in linkedhashset
        Set s=new LinkedHashSet(a1);
        s.addAll(a2);
        System.out.println("Merge 2 arraylist in linkedHashset: "+s);
        
}

}
