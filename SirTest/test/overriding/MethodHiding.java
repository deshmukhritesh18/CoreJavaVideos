package com.bnt.overriding;

class P{
	
	public static void m1() {
		System.out.println("parent class ststic ");
	}
	
	public static void m2() {
		System.out.println("parent class instance method");
	}
}//m3

class C extends P{
	/*
	 * public static void m1() { System.out.println("Child class static"); }
	 */
	public static void m2() {
		System.out.println("Child class instance method");
	}
	//m3
}
public class MethodHiding {
	public static void main(String[] args) {
		P p=new P();
		p.m1();
		p.m2();
		System.out.println("--------------");
		C c=new C();
		c.m1();
		c.m2();
		System.out.println("--------------");
		
		P p1=new C();
		p1.m1();
		p1.m2();
		System.out.println("--------------");
		
		
	}

}

/* output

parent class ststic 
parent class instance method
--------------
Child class static
Child class instance method
--------------
parent class ststic 
parent class instance method
--------------
*/