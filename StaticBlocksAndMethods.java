package com.bnt.staticControllFlow;

public class StaticBlocksAndMethods {

	
	static int i=10;
	static {
	
		m1();
		System.out.println("First Static block");
		
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("Main Method");
	}
	public static void m1() {
		System.out.println(j);
	}
	static {
		System.out.println("Static block 2");
	}
	static int j=20;
}

/*
 * 0
 *  Frist Static block
 *   Static block 2
 *    20 
 *    Main Method
 */
