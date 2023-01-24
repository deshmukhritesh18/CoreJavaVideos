package com.bnt.map;

import java.util.HashMap;

public class BasicsMap {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(100, "Ritesh");
		System.out.println(h);//{100,Ritesh}
		System.out.println(h.put(101, "Appi"));// return null because in this no value get replaced
		System.out.println(h.put(100, "Arpit"));//Ritesh-- because put method return object which we replace
		System.out.println(h);
	}

}
