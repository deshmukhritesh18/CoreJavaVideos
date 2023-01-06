package com.bnt.Constructor;

public class Student {

	int rollNo;
	String name;
	
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		Student s=new Student(101,"Ritesh");
		
		Student s1=new Student(102,"Vivek");
		System.out.println(s);
		System.out.println(s1);
	}
}
