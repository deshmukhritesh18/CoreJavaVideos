package com.bnt.colection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ClassNameOfInterface {

	public static void main(String[] args) {
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator itr=v.iterator();
		ListIterator ltr=v.listIterator();
		System.out.println("Class Name :"+e.getClass().getName());//Class Name :java.util.Vector$1
		System.out.println("Class Name :"+itr.getClass().getName());//Class Name :java.util.Vector$Itr
		System.out.println("Class Name :"+ltr.getClass().getName());//Class Name :java.util.Vector$ListItr
	}
}
