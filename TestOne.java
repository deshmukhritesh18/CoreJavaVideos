package inheritance;

class Parent{
	
	public void m1() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent{
	public void m2() {
		System.out.println("Child class method");
	}
}

public class TestOne {
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.m1();
		//p.m2; not valid
		
		Child c=new Child(); 
		c.m1();//valid
		c.m2();
		
		Parent p1=new Child();
		p1.m1();
		//p1.m2(); not valid
		
		//Child c1=new Parent();
	}

}
