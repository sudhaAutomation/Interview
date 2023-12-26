package javaInterviewScripts;

import java.util.Arrays;

public class ReverseString1 {

	public static void main(String[] args) {
		String s="Test";
		System.out.println(new StringBuffer(String.valueOf(s)).reverse());
		// Reverse the string with out using the predefined classes?
		String str = "Sudharani Software Tester";
		String ar[] = str.split("");
		System.out.println(Arrays.toString(ar));
		int alen = ar.length;
		System.out.println(alen);
		String rnm = "";
		for (int i = alen - 1; i >= 0; i--) {
			rnm = rnm.concat(ar[i]);

		}

		System.out.println(rnm);
	}
	
	public static void rev(String str) {
		String[] a=str.split("");
		System.out.println(Arrays.toString(a));
	}

}
