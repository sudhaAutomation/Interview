package javaInterviewScripts;

public class RegularExpression {

	public static void main(String[] args) {
		// regular Expression=[^a-zA-Z0-9]
		String snm = "^&%&^%^$Hyderabad and secu&%&^$nderabad are twin cities 01234*^&56789";
		// snm = snm.replaceAll("[a-zA-Z0-9]", "");
		snm = snm.replaceAll("[^ a-zA-Z0-9]", "");
		System.out.println(snm);
		getStr("in a basket 3 mangoes and 2 apples are there");
	}

	public static void getStr(String s) {
		s = s.replaceAll("[^ 0-9]", "");
		System.out.println(s);
	}
}
