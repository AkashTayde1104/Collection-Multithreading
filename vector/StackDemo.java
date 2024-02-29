package com.vector;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push('E');
		System.out.println(s);//[A,B,C,D,E]
		
		System.out.println(s.search("B"));//4
		System.out.println(s.search("z"));//-1
		
		System.out.println(s.pop());//RETURN E  AND REMOVE FROM STACK
		System.out.println(s);//[A,B,C,D]
		
     	System.out.println(s.peek());//E   
		System.out.println(s);//[A,B,C,D,E]
		
	}

}
