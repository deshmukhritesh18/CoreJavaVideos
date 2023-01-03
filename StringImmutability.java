package objectClass;

public class StringImmutability {
	
	public static void main(String[] args) {
		String s=new String("Ritesh");
		String s1=s.concat("Deshmukh");
		System.out.println(s);
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("Ritesh");
		System.out.println(sb);
		sb.append("Deshmukh");
		System.out.println(sb);
		
		
		System.out.println("********************");
		
		String str2=new String("Ritesh");
		String str3=new String("Ritesh");
		
		System.out.println(str2==str3);//false 
		System.out.println(str2.equals(str3));//true
		
		StringBuffer sb2=new StringBuffer("Ritesh");
		StringBuffer sb3=new StringBuffer("Ritesh");
		System.out.println(sb2.reverse());
		System.out.println(sb3.charAt(4));
		sb3.setLength(3);
		System.out.println("setLength : "+sb3);
		
		System.out.println(sb2==sb3);//false
		System.out.println(sb2.equals(sb3));//false
		
		
		char []ch= {'R','i','t','e','s','h'};
		
		String sArray=new String(ch);
		System.out.println(sArray);
		
		System.out.println("*************************************");
		String str4=new String("RITESH");
		String str5=new String("ritesh");
		System.out.println(str4.equals(str5));//false
		System.out.println(str4.equalsIgnoreCase(str5));//true 
	}

}
