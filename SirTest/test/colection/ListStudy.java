package com.bnt.colection;

import java.util.ArrayList;

public class ListStudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		
		System.out.println(al);
		System.out.println("Äfter remove 2 "+ al);
		al.add(2, "R");
		System.out.println("2 nd index add R "+ al);
		al.add("N");
		System.out.println(al);
		for(Object o:al) {
			if(o!=null) {
				System.out.println(o.toString()+"B");
			//	System.out.println("null");
			}
			
			
		}
	}
}
