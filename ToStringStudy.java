package objectClass;

import java.util.ArrayList;

public class ToStringStudy {
	
	
	public static void main(String[] args) {


		String s=new String("Ritesh");
		System.out.println(s);
		Integer i=new Integer(10);
		System.out.println(i);
		
		ArrayList al=new ArrayList();
		al.add("Ritesh");
		al.add(10);
		System.out.println(al);
		
		ToStringStudy t=new ToStringStudy();
		System.out.println(t);
		
	}

}
