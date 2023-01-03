package com.bnt.overriding;

class P1{
	public void m1(int...x) {
		System.out.println("Parent calss var-arg method");
		
	}
}
class C1 extends P1{
	/*
	 * public void m1(int... x) {
	 * System.out.println("Child calss int method method");
	 * 
	 * }
	 */

	public void m1(int x) {
		System.out.println("Child calss int method method");
		
	}
}

public class VarArgsOverriding {

	public static void main(String[] args) { 
	  P1 p=new P1();
	  p.m1(10);//Parent calss var-arg method
	  
	  C1 c=new C1();
	  c.m1(10);// Child calss int method method
	  
	  P1 p1=new C1();
	  p1.m1(10);//Parent calss var-arg method
	}
}
// its not method overriding arguments are different its overloading