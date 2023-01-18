package com.bnt.colection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Ritesh");
		l.add("Shiv");
		l.add("Akshay");
		l.add("Shivam");
		l.add("Shivaji");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			String s = (String) ltr.next();
			if(s.equals("Shiv")) {
				ltr.remove();
				
			}else if(s.equals("Shivaji")) {
				ltr.add("Vivek");
			}else if(s.equals("Akshay")) {
				ltr.set("Parag");
				
			}
		}
		System.out.println(l);
	}
}
