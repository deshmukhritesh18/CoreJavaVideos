package com.bnt.overriding;
class P3{
	
	public void m1() {
		System.out.println("In parent class");
	}
}
class C3  extends P3{
	public void m1() {
		System.out.println("In child  class");
	}
	public void m2() {
		System.out.println("In child  class");
	}
}


public class ParentChildRefrance {

public static void main(String[] args) {
	
	P3 p=new C3();
	p.m1();
	//p.m2();//me can call
	//C3 c=new P3();
	Object o=new String("Ritesh");
	StringBuffer sb=(StringBuffer)o;//run Time exception 
	
	/*
	 * Exception in thread "main" java.lang.ClassCastException: java.lang.String
	 * cannot be cast to java.lang.StringBuffer at
	 * com.bnt.overriding.ParentChildRefrance.main(ParentChildRefrance.java:27)
	 */
	
	String s=new String("Ritesh");
	Object o1=(Object)s;
	System.out.println(o1);
	
	
	
}

	
}
