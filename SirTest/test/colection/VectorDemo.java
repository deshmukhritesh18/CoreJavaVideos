package com.bnt.colection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
	
		//Vector v=new Vector();
		Vector v=new Vector(10,5);
		System.out.println("Vector inital capacity : "+ v.capacity());
		for(int i=1;i<=10;i++) {
			v.addElement(i);
			}
		System.out.println("Vector capacity after adding 10 elements : "+ v.capacity());
		System.out.println(v);
		v.addElement("A");
		System.out.println("Vector capacity after adding 11th element : "+ v.capacity());
		System.out.println(v);
	}

}
