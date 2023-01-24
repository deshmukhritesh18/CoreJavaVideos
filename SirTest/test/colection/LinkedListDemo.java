package com.bnt.colection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Ritesh");
		l.add(30);
		l.add(null);
		l.add("Ritesh");
		
		System.out.println(l);
		
		l.set(0, "Deshmukh");
		l.add(0,"Vivek");
		l.removeLast();
		l.addFirst("RRR");
		System.out.println(l);
		
	}

}
