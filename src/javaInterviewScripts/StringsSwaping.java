package javaInterviewScripts;

public class StringsSwaping {

	public static void main(String[] args) {
		swapOnString("Ram","Mohan");
		String a = "Hyderabad";
		String b = "Secunderbad";
		a = a + b;
		System.out.println(a.length());// 20
		System.out.println(b.length());//11
		System.out.println("before swaping");
		System.out.println(a);
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

	}
	public static void swapOnString(String s1,String s2) {
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.replace(s2, "");
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
