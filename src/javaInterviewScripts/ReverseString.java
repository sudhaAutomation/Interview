package javaInterviewScripts;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Swhizz Technologies Madhapur";
		String s[] = str.split("\\s");
		String reverstring = "";
		for (String words : s) {
			StringBuilder ob = new StringBuilder(words);
			ob.reverse();
			reverstring = reverstring + ob.toString() + " ";
		}
		System.out.println(reverstring);
	}

}
