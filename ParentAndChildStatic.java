package com.bnt.staticControllFlow;

class B{
	static int i=10;
	static {
		m1();
		System.out.println("Parent Static Block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("In parent main method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static int j=20;
	
}

//output if we run parent class

/*
 * 0 
 * Parent Static Block
 * 20 
 * In parent main method
 */

public class ParentAndChildStatic extends B {

	static int x=100;
	static {
		m2();
		System.out.println("1st static block inchild class");
	}
	public static void main(String[] args) {
		m2();
		System.out.println("In child min method");
	}
	public static void m2() {
		System.out.println(y);
	}
	static{
		System.out.println("2nd static block inchild class");
	}
	static int y=200;
}

//output if we run child class

/*0
  Parent Static Block
  0
  1st static block inchild class
  2nd static block inchild class
  200
  In child min method*/

