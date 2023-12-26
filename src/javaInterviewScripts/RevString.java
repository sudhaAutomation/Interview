package javaInterviewScripts;

public class RevString {

	public static void main(String[] args) {
		String str = "Welcome to Swhizz Technologies";
		System.out.println(new StringBuffer(String.valueOf(str)).reverse());
		// String Buffer class all methods are synchronised methods,,they are designed
		// for multi threading concept and theis performance is low campare to builder
		// String BUilder is a fast process

		StringBuilder r = new StringBuilder(str);
		System.out.println(r.reverse());
	}

}
