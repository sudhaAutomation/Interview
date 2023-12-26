package javaInterviewScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Sorting {

	public static void main(String[] args) {
		int b[]= {89,65,23,11,89,34,90,12};
		ascend(b);
		Sorting sort = new Sorting();
		int[] a = { 5, 2, 8, 7, 1 };
		sort.ascend(a);
		sort.descend(a);
		ArrayList list = new ArrayList(Arrays.asList(a));
		Collections.sort(list);
		System.out.println(Arrays.toString(list.toArray()));
	}

	public static void ascend(int a[]) {
		
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println(Arrays.toString(a));
	}

	public void descend(int a[]) {

		//int[] a = { 5, 2, 8, 7, 1 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println(Arrays.toString(a));
	
	}
}
