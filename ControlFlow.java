package com.bnt.exception;

public class ControlFlow {

	public static void main(String[] args) {
		try {
		
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}catch(Exception e) {
			System.out.println(10/0);
		}
		System.out.println("4");
	}

}
