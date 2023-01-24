package com.bnt.exception;

import java.util.Scanner;

class ToYongException extends RuntimeException{
	
	ToYongException(String s){
		super(s);
	}
	
}
class ToOldException extends RuntimeException{
	
	ToOldException(String s){
		super(s);
	}

}
	public class CustomisedException {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your age");
		int age=sc.nextInt();
		
		if (age >60) {
			throw new ToOldException("Your not elligiale for marraiage");
		}else if(age <18 ) {
			throw new ToYongException("Wait and try after your 18 +");
		}else {
			System.out.println("Thanks for visiting we will get back to you");
		}
	}
	
	
}
