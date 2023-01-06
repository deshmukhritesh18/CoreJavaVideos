package com.bnt.staticControllFlow;

class Parent{
	int x=10;
	{
		m1();
		System.out.println("1st Instance block in parent class");
	}
	Parent(){
		System.out.println("In constructor of patent");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
	 	
		System.out.println("In main method of parent class");
		
		
	}
	public void m1() {
		System.out.println(j);
	}
	
	int j=20;
	
}

public class InstanceBlockParentToChild extends Parent{
	int x=100;
	{
		m2();
		System.out.println("1st Instance block in child");
	}
	InstanceBlockParentToChild(){
		System.out.println("In constructor in child");
	}
	
	public static void main(String[] args) {
		InstanceBlockParentToChild i=new InstanceBlockParentToChild(); //we create an object output will change
	 	
		System.out.println("In main method in child");
		//InstanceBlockParentToChild i2=new InstanceBlockParentToChild();
		
	}
	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("2nd instance block in child");
	}
	int y=200;
}

/*
 * 0
1st Instance block in parent class
In constructor of patent
0
1st Instance block in child
2nd instance block in child
In constructor in child
In main method in child
*/
