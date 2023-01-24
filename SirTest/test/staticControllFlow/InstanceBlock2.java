package com.bnt.staticControllFlow;

public class InstanceBlock2 {
	int x=10;
	{
		m2();
		System.out.println("1st Instance block");
	}
	InstanceBlock2(){
		System.out.println("In constructor");
	}
	
	public static void main(String[] args) {
	 	
		InstanceBlock2 i=new InstanceBlock2(); //we create an object output will change
	 	
		System.out.println("In main method");
	}
	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("2nd instance block");
	}
	int y=200;
}
/*
0
1st Instance block
2nd instance block
In constructor
In main method*/


