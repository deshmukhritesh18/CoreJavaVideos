package objectClass;

public class CloneStudy implements Cloneable {
	
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		 CloneStudy c1=new CloneStudy();
		 
		// CloneStudy c2=c1;// this is not cloning
		 
		 CloneStudy c2=(CloneStudy)c1.clone();
		 
		 c2.i=300;
		 c2.j=1000;
		 System.out.println("After Clone method value of i & j is "+c2.i+ "   "+c2.j);
		 
		 System.out.println(c1.hashCode());
		 System.out.println(c2.hashCode());
		 
	}

}
