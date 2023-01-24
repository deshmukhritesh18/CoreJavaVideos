package com.bnt.staticControllFlow;

public class InstanceBlock2Objects {

	int x=10;
	{
		m2();
		System.out.println("1st Instance block");
	}
	InstanceBlock2Objects(){
		System.out.println("In constructor");
	}
	
	public static void main(String[] args) {
		InstanceBlock2Objects i=new InstanceBlock2Objects(); //we create an object output will change
	 	
		System.out.println("In main method");
		InstanceBlock2Objects i2=new InstanceBlock2Objects();
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
In main method
0
1st Instance block
2nd instance block
In constructor
*/