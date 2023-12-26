package javaInterviewScripts;

public class Reversenumbers {

	public static void main(String[] args) {
		// 1.using algorthm
		long l=72345l;
		long rev=0;
		while (l!=0) {
			rev=rev*10+l%10;
			l=l/10;
		}
		System.out.println("the reverse num is "+rev);
		
		//2.by using stringBuffer and reverse method
		
		long lon=12345;
		short s=123;
		System.out.println(new StringBuffer(String.valueOf(s)).reverse());
		StringBuffer rev2=new StringBuffer(String.valueOf(lon)).reverse();
		System.out.println(rev2);
		//System.out.println(new StringBuffer(String.valueOf(lon)).reverse());
		String str3="ganapathi";
		StringBuffer rv=new StringBuffer(String.valueOf(str3)).reverse();
		System.out.println(rv);
	}

}
