package inheritance;

class C{
	
	public Object m1() {
		return null;
	}
}

class B extends C{

	public String m1() {
		return null;
	}
}


public class OverridingTest {
	public static void main(String[] args) {
		OverridingTest t=new OverridingTest();
		System.out.println(t instanceof OverridingTest);
		if(t instanceof Object) {
			System.out.println("T is instance of Object");
			
		}else
		{
			System.out.println("Not instance");
		}
	}

}
