package com.bnt.colection;

import java.util.Iterator;
import java.util.Vector;

public class IteratorStudy {
	public static void main(String[] args) {
		Vector v=new Vector(10,5);
		System.out.println("Vector inital capacity : "+ v.capacity());
		for(int i=1;i<=10;i++) {
			v.addElement(i);
			}
		
		System.out.println(v);
		Iterator itr=v.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.println(i);
				
			}else {
				itr.remove();
			}
			
			
		}
		System.out.println(v);
	}

}
