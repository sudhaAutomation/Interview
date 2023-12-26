package javaInterviewScripts;

import java.util.Arrays;

public class Fibonocci {

	public static void main(String[] args) {
		System.out.println();
		printFib(20);
		System.out.println();
		System.out.println("using array");

		fibArray(10);
	}

	public static void printFib(int n) {
		int one = 0, two = 1;
		System.out.println(one);
		System.out.println(two);

		for (int i = 2; i < n; i++) {
			int third = one + two;

			System.out.println(third);
			one = two;
			two = third;

		}

	}

	public static void fib(int n) {
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i <= n; i++) {
			int third = first + second;
			System.out.println(third);
			first = second;
			second = third;

		}

	}

	public static void fibArray(int n) {
		int[] ary = new int[n];
		ary[0] = 0;
		ary[1] = 1;
		for (int i = 2; i < ary.length; i++) {
			ary[i] = ary[i - 1] + ary[i - 2];
		}
		System.out.println(Arrays.toString(ary));
	}
}
