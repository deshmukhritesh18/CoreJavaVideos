package inheritance;

class A{
	
	public void m1() {
		System.out.println("no arg method");
	}
	public void m1(int i) {
		System.out.println("int method");
	}
	public void m1(double d) {
		System.out.println("double method");
	}
	public void m1(float f) {
		System.out.println("float method");
	}
	public void m1(long l) {
		System.out.println("long method");
	}
}

public class OverLoading {

public static void main(String[] args) {
	A a=new A();
	a.m1();
	a.m1('a');
	a.m1(10);
	a.m1(10.5f);
	a.m1(39.2);
	a.m1(1l);
}
}
