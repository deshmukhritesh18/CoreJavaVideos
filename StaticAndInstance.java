package com.bnt.staticControllFlow;

public class StaticAndInstance {
	int i=10;
	{
		i=20;
		System.out.println("1st Instance Block");
	}
	static {
		System.out.println("1st static block");
	}
	StaticAndInstance(){
		System.out.println("in constructor");
	}
	public static void main(String[] args) {
		StaticAndInstance s=new StaticAndInstance();
		System.out.println("in main method");
		StaticAndInstance s1=new StaticAndInstance();
		
	}
	static {
		System.out.println("2nd static block");
	}
	{
		System.out.println("2nd Instance block ");
	}

}
