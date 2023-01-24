package com.bnt.staticControllFlow;

public class InstanceBlock {
	int x=10;
	{
		m2();
		System.out.println("1st Instance block inchild class");
	}
	public static void main(String[] args) {
	 	
		System.out.println("In main method");
	}
	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("2nd static block inchild class");
	}
	static int y=200;
}
// op on main method 

