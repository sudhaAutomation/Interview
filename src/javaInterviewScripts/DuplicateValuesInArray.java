package javaInterviewScripts;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		String s[] = { "Java", "python", "C++", "Java", "Ruby", "C++" };

		// to get the duplicate values from the array
		// here we have to use 2 for loops and need to comapare with the each and every
		// element
		// the process will be late
		// this we called as O(n*n) or O(n^2)

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println("duplicate value in array is " + s[i]);
				}

			}

		}

		// 2.Using HashSet,which allows only unique values
		// here we can find the duplicate value by using only 1 for loop
		// we call it as O(n)
		Set<String> hash = new HashSet<String>();

		for (String array : s) {
			//System.out.println(array);
			if (hash.add(array) == false) {
				System.out.println("duplicate value in array is " + array);

			}

		}
		
		}
	}

