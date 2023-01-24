package com.bnt.map.identityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapStudy {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		h.put(i1, "Ritesh");
		h.put(i2, "Vivek");
		System.out.println(h);
		
		IdentityHashMap ih=new IdentityHashMap();
		Integer ih1=new Integer(10);
		Integer ih2=new Integer(10);
		
		ih.put(ih1, "Ritesh");
		ih.put(ih2, "Vivek");
		System.out.println(ih);
	}
	

}
