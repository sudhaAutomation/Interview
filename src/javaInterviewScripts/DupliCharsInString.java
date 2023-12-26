package javaInterviewScripts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DupliCharsInString {

	public static void main(String[] args) {
		// System.out.println(">> is polindrome : " + isPolindrome("Ramar"));
		// System.out.println(">> is anagram : " + isAnagram("Divya", "Vidya"));
		// System.out.println(">> is remove spaces : "
		// + replaceSpaces("Vidya adfdsf adfdsfda adsafadsfdasf afdsfads"));
		dupChar("swhizzTechtest");
		String inputString = "programminG with String";
		dupChar(inputString);
		findDup(inputString);
		// Convert the string to lowercase (optional, to make it case-insensitive)
	}

	public static void findDup(String str) {
		HashSet<Character> set = new HashSet<>();
		str = str.toLowerCase();
		for (char a : str.toCharArray()) {
			if (set.add(a) == false) {
				System.out.println(a + " is a duplicate cahracter");
			}
		}
	}
	public static void dupChar(String s) {
		HashMap<Character, Integer> h = new HashMap<>();
		s = s.toLowerCase().replace(" ", "");
		for (char ca : s.toCharArray()) {
			if (ca == ' ') {
				continue;
			}
			if (h.containsKey(ca)) {
				h.put(ca, h.get(ca) + 1);
			} else {
				h.put(ca, 1);
			}

		}

		System.out.println(h);
	}

	
	public static boolean isPolindrome(String str) {
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		return str.equalsIgnoreCase(str1);
	}
	// divya vidya
	public static boolean isAnagram(String str, String str1) {
		str = str.toUpperCase();
		str1 = str1.toUpperCase();
		char[] ar = str.toCharArray();
		char[] ar1 = str1.toCharArray();
		
		
		Arrays.sort(ar);
		Arrays.sort(ar1);
		
		return Arrays.equals(ar, ar1);
	}

	public static String replaceSpaces(String input) {
		return input.replaceAll("\\s+", "");
	}
}
