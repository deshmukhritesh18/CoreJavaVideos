package com.bnt.overriding;
// it is not overriding
class P2{
	int x=1000;
}
class C2 extends P2{
	int x=2000;
}

public class VariableOverloading {

	public static void main(String[] args) {

		P2 p2=new P2();
		System.out.println(p2.x);

		C2 c2=new C2();
		System.out.println(c2.x);
		
		P2 p3=new C2();
		System.out.println(p3.x);
		

	}
}
