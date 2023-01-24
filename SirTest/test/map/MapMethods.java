package com.bnt.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Ritesh",101);
		h.put("Shivanjali",102);
		h.put("Akshay",103);
		h.put("Swaranjali",104);
		h.put("Viahsnu",105); 
		
		System.out.println(h);//{Akshay=103, Ritesh=101, Swaranjali=104, Viahsnu=105, Shivanjali=102}
		
		System.out.println(h.put("Shivanjali",106));//102
		
		Set s=h.keySet();
		System.out.println(s);//[Akshay, Ritesh, Swaranjali, Viahsnu, Shivanjali]
		
		Collection c=h.values();
		System.out.println(c);//[103, 101, 104, 105, 106]
		
		Set s1=h.entrySet();
		System.out.println(s1);//[Akshay=103, Ritesh=101, Swaranjali=104, Viahsnu=105, Shivanjali=106]
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e1=(Map.Entry) itr.next();//Map.Entry==map is outer class and Entery is Inner class
			System.out.println(e1.getKey()+" => "+e1.getValue());
			if(e1.getKey()=="Shivanjali") {
				e1.setValue(100000);
				
			}
		
		}
				System.out.println(h);//{Akshay=103, Ritesh=101, Swaranjali=104, Viahsnu=105, Shivanjali=100000}
	}
}
