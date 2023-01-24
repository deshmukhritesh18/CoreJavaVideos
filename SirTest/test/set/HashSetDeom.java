package com.bnr.collection.set;

import java.util.HashSet;

public class HashSetDeom {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		Student s=new Student(101,"Ritesh",26);
		//h.add(new Student(101,"Ritesh",26));
		//h.add(new Student(101,"Ritesh",26));
		h.add(s);
		h.add(s);
		h.add(Integer.valueOf(29));
		h.add(Integer.valueOf(29));
		
		
		System.out.println(h);
	}
	

}
