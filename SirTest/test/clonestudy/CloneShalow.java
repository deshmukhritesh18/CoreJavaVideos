package com.bnt.clonestudy;

public class CloneShalow implements Cloneable {
	
		int rollno;  
		String name;  
		  
		CloneShalow(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
		}  
		  
		public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		  
		public static void main(String args[]){  
		try{  
			CloneShalow s1=new CloneShalow(101,"amit");  
		  
			CloneShalow s2=(CloneShalow)s1.clone();  
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		  
		}catch(CloneNotSupportedException c){}  
	}

}
