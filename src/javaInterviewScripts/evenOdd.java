package javaInterviewScripts;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
//		Scanner reader = new Scanner(System.in);// scanner class will give the access to enter the data from the console
//												// tab
//
//		System.out.println("please enter a number");
//		int num = reader.nextInt();
		int num=21;
		System.out.println(num);// u can enter the number from the command prompt
		if (num % 2 == 0) {
			System.out.println("the num is even " + num);
		} else {
			System.out.println("the number is odd " + num);
		}
	}

}
